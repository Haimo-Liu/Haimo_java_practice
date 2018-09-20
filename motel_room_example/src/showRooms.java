import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

public class showRooms {
    public static void main(String args[]) throws IOException {
        room rooms[] = new room[6];
        Scanner room_scanner = new Scanner(new File("/Users/haimo.liu/Documents/java_files/roomList.txt"));

        for(int num = 0; num < 6; num++){
            rooms[num] = new room();
            rooms[num].readRoom(room_scanner);
        }

        room_scanner.close();

        for(int num = 0; num < 6; num++){
            out.print("room number ");
            out.print(num+1);
            out.print("\n");
            rooms[num].writeRoom();
            out.print("\n");
        }
    }
}
