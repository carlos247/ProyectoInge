/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Carlos
 */
public class Base_de_datos {

    /**
     * @pre año != NU
     * @post select = año
     * @return bus.dato
     */
    public String select() {
        Buscador bus = new Buscador();
        return bus.dato();
    }

    /**
     * @pre Accion en un boton
     * @return bus.dato
     */
    public String parametro_switch() {
        Buscador bus = new Buscador();
        //System.out.println(bus.eleccion_para_switch());
        return bus.eleccion_para_switch();
    }

    /*
     *<inv>          coneccion activa
     *@pre           accion del usuario
     *@post          rs = resultado de la consulta 
     *@return        rs
     */
    public ResultSet Select() {
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProyectoInge", "postgres", "carlos");
        } catch (SQLException ex) {
            Logger.getLogger(Base_de_datos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no");
        }
        try {
            switch (parametro_switch()) {
                case "por_anyo":
                    //seleccionamos la tabla de la base de datos la cual lleva por nombre estudiante
                    pstmt = conn.prepareStatement("SELECT \"nombre\", \"primer_apellido\", \"segundo_apellido\""
                            + "FROM \"estudiantes\" WHERE \"fecha_graduacion\" = ?;");
                    pstmt.setString(1, select());
                    rs = pstmt.executeQuery();
                    break;
                case "por_nombre":
                    //seleccionamos la tabla de la base de datos la cual lleva por nombre estudiante
                    pstmt = conn.prepareStatement("SELECT \"nombre\", \"primer_apellido\", \"segundo_apellido\""
                            + "FROM \"estudiantes\" WHERE \"nombre\" = ?;");
                    pstmt.setString(1, select());
                    rs = pstmt.executeQuery();
                    break;

                case "por_info_base":
                    //seleccionamos la tabla de la base de datos la cual lleva por nombre estudiante
                    pstmt = conn.prepareStatement("SELECT \"nombre\", \"primer_apellido\", \"segundo_apellido\""
                            + "FROM \"estudiantes\";");
                    rs = pstmt.executeQuery();
                    break;

                case "base":
                    //seleccionamos la tabla de la base de datos la cual lleva por nombre estudiante
                    pstmt = conn.prepareStatement("SELECT \"nombre\", \"primer_apellido\", \"segundo_apellido\""
                            + "FROM \"estudiantes\";");
                    rs = pstmt.executeQuery();
                    break;

                case "con_email":
                    //seleccionamos la tabla de la base de datos la cual lleva por nombre estudiante
                    //  pstmt = conn.prepareStatement("SELECT \"nombre\", \"primer_apellido\", \"segundo_apellido\", \"correo_electronico\""
                    //        + "FROM \"estudiantes\";");
                    pstmt = conn.prepareStatement("SELECT \"correo_electronico\""
                            + "FROM \"estudiantes\";");
                    rs = pstmt.executeQuery();
                    //    System.out.println(parametro_switch() );
                    break;
            }

        } catch (Exception e) {
            System.out.println("el select contiene un " + select());
            System.out.println("Problema al consultar la base de datos 1 ");

        }
        return rs;
    }

    /*
     *@pre           rs.next != NULL
     *@post          cadena += rs.getString(i) 
     *@return        cadena
     */
    public String dat() {
        Base_de_datos x = new Base_de_datos();
        ResultSet rs = null;
        String cadena = "";
        rs = x.Select();
        try {
            if ("con_email".equals(parametro_switch())) {
                while (rs.next()) {
                    //imprimimos todos los datos contenidos en la tabla
                    cadena += rs.getString(1);
                }
            } else {
                while (rs.next()) {
                    //imprimimos todos los datos contenidos en la tabla
                    cadena += rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + "\n";

                }
            }
        } catch (Exception e) {
            System.out.println("Problema al imprimir la base de datos ");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return cadena;

    }
    /*
     public void resultadoParaCorreo() throws ClassNotFoundException {
     
     String destino = Correo.destino;
     String asunto = Correo.asunto;
     String mensaje = Correo.mensaje;
     String archivo = Correo.archivo;
     Correo.EnviarCorreo(destino, asunto, mensaje, archivo);
     System.out.println("reholi");
     }
     */

    public void resultadoParaFacebook() throws ClassNotFoundException {
        Facebook FB = new Facebook("");
        FB.search(dat());
    }

}
