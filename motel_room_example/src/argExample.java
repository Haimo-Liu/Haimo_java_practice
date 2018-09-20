import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import static java.lang.System.out;


public class argExample {
    public static void main(String args[]) throws IOException {

        if(args.length != 2){
            System.out.println("you should provide arguments: file_path number_of_lines");
            System.exit(1);
        }

        PrintStream filePrinter = new PrintStream(args[0]);
        int numLines = Integer.parseInt(args[1]);
        Random generator = new Random();


        for(int num = 0; num < numLines; num++){
            filePrinter.println(generator.nextInt(10));
        }

        filePrinter.close();
    }
}
