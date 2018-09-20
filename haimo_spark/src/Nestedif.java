import static java.lang.System.out;
import java.util.Scanner;


public class Nestedif {
    public static void main (String args[]){
        out.println("please provide your username: ");
        Scanner keyboard = new Scanner(System.in);

        String user_name = keyboard.next();
        if(user_name.equals("haimo")){
            out.println("please provide your password");
            String password = keyboard.next();

            if(password.equals("haimoliu")){
                out.println("you're in");
            } else{
                out.println("incorrect password");
            }
        } else{
            out.println("incorrect username");
        }
    }
}
