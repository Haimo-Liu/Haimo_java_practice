import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;
import java.lang.System;

public class room {
    private int guest_num;
    private double room_rate;
    private boolean smoking_status;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public void readRoom(Scanner room_scanner){
        guest_num = room_scanner.nextInt();
        room_rate = room_scanner.nextDouble();
        smoking_status = room_scanner.nextBoolean();
    }

    public void writeRoom(){
        System.out.print("number of guests");
        System.out.print("\t");
        System.out.print(guest_num);
        System.out.print("\t");
        System.out.print("room rate is");
        System.out.print("\t");
        System.out.print(currency.format(room_rate));
        System.out.print("\t");
        System.out.print("smoking allowed: ");
        System.out.print(smoking_status? "yes": "no");
    }
}
