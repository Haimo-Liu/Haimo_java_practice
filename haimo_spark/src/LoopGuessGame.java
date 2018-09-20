import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;


public class LoopGuessGame {

    public static void main (String args[]){

        out.println("please guess a random number between 1 and 10: ");
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        int guess_time = 0;

        int random_number = generator.nextInt(10) + 1;
        int guess_number = keyboard.nextInt();
        guess_time++;


        while (guess_number != random_number) {
            out.println("wrong guess");
            out.println("feel free to try again");
            out.println("please enter a random number between 1 and 10: ");
            guess_number = keyboard.nextInt();
            guess_time ++;
        }

        out.println("congrats, you won after ");
        out.println(guess_time + " guesses");
        keyboard.close();
    }
}
