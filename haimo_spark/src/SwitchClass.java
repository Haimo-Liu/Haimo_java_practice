import static java.lang.System.out;
import java.util.Scanner;


public class SwitchClass {
    public static void main(String args[]){
        out.println("please choose your version? ");
        Scanner keyboard = new Scanner(System.in);

        int version = keyboard.nextInt();

        switch(version) {
            case 1: out.println("this is version 1 you fuck");
            break;

            case 2: out.println("this is version 2 you shit");
            break;

            default: out.println("this is a wrong version");
            break;
        }
        out.println("oooooh.....shit");

        keyboard.close();
    }
}
