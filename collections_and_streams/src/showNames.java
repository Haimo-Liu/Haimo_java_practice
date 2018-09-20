import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class showNames {

    public static void main(String ars[]) throws IOException {
        Scanner name_scanner = new Scanner(new File("/Users/haimo.liu/Documents/java_files/names.txt"));

        ArrayList<String> people_list = new ArrayList<String>();

        while(name_scanner.hasNext() == true) {
            people_list.add(name_scanner.nextLine());
        }

        people_list.remove(0);
        people_list.add(2, "Fan Wang");

        Iterator<String> ite = people_list.iterator();

        while (ite.hasNext() == true) {
            System.out.println(ite.next());
        }
        }
    }
