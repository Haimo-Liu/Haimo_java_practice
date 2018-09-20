public class nine_temperature {
    private double number;
    private TempScale scale;

    public nine_temperature(){
        number = 0.0;
        scale = TempScale.kelven;
    }

    public nine_temperature(double input){
        number = input;
        scale = TempScale.kelven;
    }

    public nine_temperature(TempScale input){
        number = 0.0;
        scale = input;
    }

    public nine_temperature(double num_input, TempScale scale_input){
        number = num_input;
        scale = scale_input;
    }

    public void setNumber(double input_num){
        number = input_num;
    }

    public double getNumber(){
        return number;
    }

    public void setScale(TempScale input_scale){
        scale = input_scale;
    }

    public TempScale getScale(){
        return scale;
    }
}
