/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author López
 */
public class BuscadorF {
   
    private final FacebookClient facebookClient;
    ArrayList<User> userList;
    ArrayList<String> usuario;
    private static final String accessToken = "CAACEdEose0cBAIZCwkqbZB6gJtABBZAdZAl7VgHNYDF9nBDeFBe6tUidaYpMyJqjdwgKWlmRaNOJuhn94annnKPABkN8c9F7wJGBVmq53oyy4gFaNlKeaAMAQZA7NTLDr8z8ZB4XrXt7LZCQuemWpPPZAwx0GdhyzZAnmLrxmFS9PSInQHspZBTbfsLdrWZBKEdhQiIvTZBhWuMaU9DVus7FKiAZCclPYZBpKZA2R6fKSZC65y3y3gZDZD";
    BuscadorF(){
      /*  try {
            String Nombre;
            Base_de_datos BD = new Base_de_datos();
            Nombre = BD.dat();
            buscar(Nombre);
        } catch (Exception e) {
            Logger.getLogger(Facebook.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("La base de datos no devolvio nada ");
        }*/
        facebookClient = new DefaultFacebookClient(accessToken);
        userList = new ArrayList();
        usuario = new ArrayList();
    }
     
    public void buscar(String name){
        userList.clear();
        out.println("Buscando por favor espere");
        String temp;
        Connection<User> publicSearch;
        publicSearch = facebookClient.fetchConnection("search", User.class,Parameter.with("q", name), Parameter.with("type", "user"));

        for (int i = 0; i < publicSearch.getData().size(); ++i){
            temp = publicSearch.getData().get(i).getId();
            userList.add(facebookClient.fetchObject(temp, User.class));  
            out.println("\t"+userList.get(i).getName()
                    +" "+userList.get(i).getEmail()
                    +" "+userList.get(i).getBirthday());
        }
    }
    public ArrayList<String> getResultado(){
        usuario.clear();
        for (int i = 0; i < userList.size(); ++i){
            usuario.add(userList.get(i).getName());  
            //out.println("\t"+userList.get(i).getName()+" "+userList.get(i).getId());
        }
        return usuario;
    }
    
    public void buscarEmail(String e){
        for (int i = 0; i < userList.size(); ++i){
            if(userList.get(i).getEmail().isEmpty() || !e.equals(userList.get(i).getEmail()) ){
                userList.remove(i);
            }  
        } 
    }
    
    public void buscarLocation(String l){
        for (int i = 0; i < userList.size(); ++i){
            if(userList.get(i).getLocale().isEmpty() || !l.equals(userList.get(i).getLocale()) ){
                userList.remove(i);
            }  
        }
    }
    
    public void buscarBirthday(String b){
        for (int i = 0; i < userList.size(); ++i){
            if(userList.get(i).getBirthday().isEmpty()  || !b.equals(userList.get(i).getBirthday())){
                userList.remove(i);
            }  
        }
    }
    
    public void buscarHometown(String h){
        for (int i = 0; i < userList.size(); ++i){
            System.out.println(userList.get(i).getHometownName().isEmpty());
            if(userList.get(i).getHometownName().isEmpty() || !h.equals(userList.get(i).getHometownName()) ){
                userList.remove(i);
            }  
        }
    }
}


