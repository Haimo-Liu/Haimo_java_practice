import static java.lang.System.out;

public class nine_temperatureSon extends nine_temperature {

    public final String format = "%.2f degrees %s \n";

    public nine_temperatureSon(){
        super();
    }

    public nine_temperatureSon(double input_number, TempScale input_scale){
        super(input_number, input_scale);
    }

    public nine_temperatureSon(double input_number){
        super(input_number);
    }

    public nine_temperatureSon(TempScale input_scale){
        super(input_scale);
    }

    public void display(){
        out.printf(format, getNumber(), getScale());
    }
}
