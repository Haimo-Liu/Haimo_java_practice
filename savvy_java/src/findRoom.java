import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.System;

public class findRoom {

    public static void main(String args[]) throws IOException {
        Scanner getRoom = new Scanner(new File("/Users/haimo.liu/Documents/java_files/arrayRoom.txt"));

        int guests[] = new int[10];

        for(int num = 0; num <= 9; num ++){
            guests[num] = getRoom.nextInt();
        }

        getRoom.close();

        int roomNum = 0;
        while(roomNum < 10 && guests[roomNum] != 0){
            roomNum++;
        }

        if(roomNum == 10){
            System.out.println("Sorry the motel is full");
        } else{
            System.out.print("How many people for room #");
            System.out.print(roomNum+1);
            System.out.print("?");


            Scanner keyboard = new Scanner(System.in);
            guests[roomNum] = keyboard.nextInt();
            keyboard.close();

            PrintStream printOut = new PrintStream("/Users/haimo.liu/Documents/java_files/arrayRoom.txt");
            for(int num = 0; num < 10; num++){
                printOut.print(guests[num]);
                printOut.print(" ");
            }

            printOut.close();
        }
    }
}
