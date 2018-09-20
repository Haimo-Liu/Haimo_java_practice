import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

public class arrayNew {
    public static void main(String args[]) throws IOException {
        int guest[] = new int[10];

        Scanner getNum = new Scanner(new File("/Users/haimo.liu/Documents/java_files/arrayRoom.txt"));

        for(int num = 0; num <= 9; num ++){
            guest[num] = getNum.nextInt();
        }

        out.println("Room\tGuests");

        for(int num = 0; num<=9; num++){
            out.print(num);
            out.print("\t");
            out.println(guest[num]);
        }

        getNum.close();
    }
}
