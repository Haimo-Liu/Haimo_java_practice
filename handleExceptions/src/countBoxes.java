import java.util.Scanner;
import java.lang.System;

public class countBoxes {

    public static void main (String args[]) {
        double box_price = 3.25;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please provide number of boxes in integer ");

        String num_box = keyboard.next();

        try{
            int number_box = Integer.parseInt(num_box);
            double total_price = box_price * number_box;

            System.out.println("the total price is " + total_price);
        } catch (NumberFormatException e) {
            System.out.println("your input is not an integer");
            e.printStackTrace();
        }
    }
}
