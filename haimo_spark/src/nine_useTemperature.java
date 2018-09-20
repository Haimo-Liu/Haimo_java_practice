import static java.lang.System.out;

public class nine_useTemperature {

    public static void main(String args[]){

        final String format = "%.2f degrees %s\n";

        nine_temperature temp = new nine_temperature();
        out.printf(format, temp.getNumber(), temp.getScale());

        nine_temperature temp1 = new nine_temperature(20.0);
        out.printf(format, temp1.getNumber(), temp1.getScale());

        temp = new nine_temperature(TempScale.celsius);
        out.printf(format, temp.getNumber(), temp.getScale());

        temp1 = new nine_temperature(33.00, TempScale.newton);
        out.printf(format, temp1.getNumber(), temp1.getScale());

    }

}
