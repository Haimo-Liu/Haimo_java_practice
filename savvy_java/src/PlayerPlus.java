import java.text.DecimalFormat;

public class PlayerPlus extends Player {

    private static int playerCount = 0;
    private static double totalOfAverage = 0.000;
    private static DecimalFormat deFormat = new DecimalFormat();

    static {
        deFormat.setMinimumFractionDigits(3);
        deFormat.setMinimumFractionDigits(3);
        deFormat.setMaximumIntegerDigits(0);
    }


    public PlayerPlus(String name, double average){
        super(name, average);

        totalOfAverage += average;
        playerCount ++;
    }

    public static double findTeamAverage(){
        return totalOfAverage/playerCount;
    }

    public static String findTeamAverageString(){
        return deFormat.format(totalOfAverage/playerCount);
    }


}
