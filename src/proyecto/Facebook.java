package proyecto;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vlad
 */
public class Facebook {

    private final FacebookClient facebookClient;
    ArrayList<User> userList;


    Facebook(String accessToken) {
        facebookClient = new DefaultFacebookClient(accessToken);
        userList = new ArrayList();
    }
  
    

    void runEverything() {

        try {
            String Nombre;
            Base_de_datos BD = new Base_de_datos();
            Nombre = BD.dat();
            search(Nombre);
        } catch (Exception e) {
            Logger.getLogger(Facebook.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("La base de datos no devolvio nada ");
        }
    }

    void search(String name) {
        out.println("* Searching connections *");

        String temp;

        Connection<User> publicSearch
                = facebookClient.fetchConnection("search", User.class,
                        Parameter.with("q", name),
                        Parameter.with("type", "user"));

        for (int i = 0; i < publicSearch.getData().size(); ++i) {
            temp = publicSearch.getData().get(i).getId();
            userList.add(facebookClient.fetchObject(temp, User.class));
            out.println("\t" + userList.get(i).getName() + " " + userList.get(i).getId());
            //  out.println("\t"+userList.get(i).toString());
        }
    }
};
