/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author abraham
 */
public class Correo {

    static private Properties p;
    static private Session s;
    static private Transport t;

    public static void conexion() {

        p = new Properties(); // inicio de sesion en el correo y mando las propiedades necesarias para enviar el correo
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user", "proyecto.ingeucr@gmail.com"); // aqui hay que cambiar de usuario y crear uno para la aplicacion
        p.setProperty("mail.smtp.auth", "true");
    }

    public static void iniciarSesion() {
        s = Session.getDefaultInstance(p, null); // aqui inicio sesion para poder habilitar el usuario
        Base_de_datos BD = new Base_de_datos();
        ArrayList<String> destinoA = BD.dat();
        String destino = "";
        for (String s : destinoA) {
            destino += s;
            String asunto = "funciona";
            String mensajeTexto = "al fin";
            String archivo = "formulario.html";
            System.out.println(destino + "/" + asunto + "/" + mensajeTexto + "/" + archivo + "\n");
            EnviarCorreo(destino, asunto, mensajeTexto, archivo);
            destino = " ";
        }

    }

    public static void EnviarCorreo(String destino, String asunto, String mensajeTexto, String Archivo) {
        try {
            BodyPart texto = new MimeBodyPart(); // por qui se crea el contenedor del mensaje en texto
            texto.setText(mensajeTexto);

            BodyPart adjunto = new MimeBodyPart(); // este es el contenedor para el archivo adjunto

            if (!Archivo.equals("")) { // aqui se comprueba si realmente se esta enviando un archivo en caso de que no haya no envia el archivo
                adjunto.setDataHandler(new DataHandler(new FileDataSource(Archivo)));
                adjunto.setFileName(Archivo);
            }

            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);

            if (!Archivo.equals("")) { // aqui se confirma si se agrega el archivo en el correo
                m.addBodyPart(adjunto);
            }
            MimeMessage mensaje = new MimeMessage(s); // aqui se prepara el mensaje para poder enviarlo en el transporte
            mensaje.setFrom(new InternetAddress("proyecto.ingeucr@gmail.com")); // aqui tambien esta el usuario que se esta usando en caso de que lo cambien despues
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
            mensaje.setSubject(asunto);
            mensaje.setContent(m);

            t = s.getTransport("smtp"); // este es el medio de transporte que utiliza esta aplicacion para mandar los correos el cual es smtp
            t.connect("proyecto.ingeucr@gmail.com", "dmxasfubenpzwvws"); // aqui se hace la conexion con el usuario en donde se usa la contraseña de aplicacion y con el respectivo usuario
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close(); // se cierra el transporte
            System.out.printf("Correo enviado con exito");
        } catch (Exception e) {
            System.out.printf("Error al enviar correo, no me puedo autentificar: " + e + " " + destino + " " + mensajeTexto + " " + asunto + " " + Archivo);
        }
    }
}
