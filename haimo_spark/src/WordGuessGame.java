import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class WordGuessGame {
   public static void main(String args[]){
       out.println("Please guess the password and type in");
       out.printf("%n");

       Scanner keyboard = new Scanner(in);
       String entered = keyboard.next();

       if(entered.equals("password")){
         out.println("the password you entered");
         out.println("contains the word 'password'");
         out.println("it is not a legal password");
         out.println("please update");
       } else{
           out.println("that's a good password");
       }

       keyboard.close();
   }
}
