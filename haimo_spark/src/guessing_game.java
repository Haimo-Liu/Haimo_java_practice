import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;


public class guessing_game {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        Random custom_gen = new Random();

        out.println("please type in a number from 1 to 10 ");

        int typed_value = keyboard.nextInt();
        int random_value = custom_gen.nextInt(10)+1;

        if(typed_value == random_value){
            out.println("congrats");
            out.println("*******");
            out.println("you won!!");
        } else{
            out.println("sorry");
            out.println("*******");
            out.println("you lost!!");
            out.println("the correct number is " + random_value);
        }

        out.println("thank you for playing this game!");

        keyboard.close();
    }
}
