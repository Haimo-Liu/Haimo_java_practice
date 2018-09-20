import java.lang.System;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class eight_useEmployee {
    public static void main(String arg[])
        throws IOException{
            Scanner diskScanner = new Scanner(new File("/Users/haimo.liu/Downloads/EmployeeInfo.txt"));

            for (int empNum = 1; empNum <= 3; empNum++){
                PayOneEmployee(diskScanner);
            }

            diskScanner.close();

    }

    static void PayOneEmployee(Scanner aScanner){
        eight_employee anEmployee = new eight_employee();

        anEmployee.setName(aScanner.nextLine());
        anEmployee.setTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
