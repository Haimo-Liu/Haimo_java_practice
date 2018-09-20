import java.text.DecimalFormat;

public class Player {
    private String name;
    private double average;


    public Player(String name, double average){
        this.name = name;
        this.average = average;
    }

    public String getName(){
        return name;
    }

    public double getAverage(){
        return average;
    }

    public String getAverageString(){
        DecimalFormat decformat = new DecimalFormat();
        decformat.setMaximumIntegerDigits(0);
        decformat.setMaximumFractionDigits(3);
        decformat.setMinimumFractionDigits(3);
        return decformat.format(average);
    }
}
