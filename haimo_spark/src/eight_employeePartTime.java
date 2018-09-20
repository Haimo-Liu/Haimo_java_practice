public class eight_employeePartTime extends eight_employee {
    private double hourlyRate;

    public void setHourlyRate(double rate){

        hourlyRate = rate;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public double calculateWeeklyIncome(int hours){
        return hourlyRate * hours;
    }
}
