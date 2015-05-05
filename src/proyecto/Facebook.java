
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;
import static java.lang.System.out;
import java.util.ArrayList;
import proyecto.Base_de_datos;

/**
 *
 * @author vlad
 */
public class Facebook {

    private static final String accessToken = "CAACEdEose0cBAAYLpENpaSPe8rBDk9xjFOlvYshdX46ZBId12b293xuwVj5YeFC73LqQWFARXvOhKV9OvZCcTHH4YZAaPW20LdtLJbIcVqrbGZBxCsoumRKyxjSy9CLoHANZAvqKqv8khvcnr1IylclvP1c91MsazYHxNLvPH4Ws8R0JYCtWihZAlglZAHuXK4RZAVPlLJ44r2VBeFbGWqHlwefvu2CqGTwZD";

    private final FacebookClient facebookClient;
    ArrayList<User> userList;

    public static void main(String[] args) {
        new Facebook(accessToken).runEverything();
    }

    Facebook(String accessToken) {
        facebookClient = new DefaultFacebookClient(accessToken);
        userList = new ArrayList();
    }

    public String resultado() throws ClassNotFoundException {
        Base_de_datos BD = new Base_de_datos();
        return BD.dat();
    }

    void runEverything() {
        
        String Nombre = "Carlos Arronte";
        search(Nombre);
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

 