public class eight_employeeFullTime extends eight_employee {
    private double weeklySalary;
    private double benefitDeduction;

    public void setWeeklySalary(double set){
        weeklySalary = set;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public void setWeeklyDeduction(double set){
        benefitDeduction= set;
    }

    public double getWeeklyDeduction(){
        return benefitDeduction;
    }


    public double calculateWeeklyIncome(){
        double income;

        income = weeklySalary - benefitDeduction;
        return income;
    }
}
