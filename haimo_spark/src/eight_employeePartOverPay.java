public class eight_employeePartOverPay extends eight_employeePartTime {

    @Override
    public double calculateWeeklyIncome(int hours){
        if(hours <= 40){
            return getHourlyRate() * hours;
        } else {
            return (getHourlyRate() * 40) + (2 * getHourlyRate() * (hours - 40));
        }

    }
}
