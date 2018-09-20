public class eight_useEmployeeSub {

    public static void main(String arg[]){
        eight_employeeFullTime fullemployee = new eight_employeeFullTime();
        eight_employeePartTime partemployee = new eight_employeePartTime();
        eight_employeePartOverPay part_over = new eight_employeePartOverPay();

        fullemployee.setName("Haimo");
        fullemployee.setTitle("product manager");
        fullemployee.setWeeklyDeduction(100);
        fullemployee.setWeeklySalary(1000);
        fullemployee.cutCheck(fullemployee.calculateWeeklyIncome());

        partemployee.setName("Joe");
        partemployee.setTitle("software engineer");
        partemployee.setHourlyRate(15);
        partemployee.cutCheck(partemployee.calculateWeeklyIncome(25));

        part_over.setName("Mark");
        part_over.setTitle("contractor");
        part_over.setHourlyRate(15);
        part_over.cutCheck(part_over.calculateWeeklyIncome(50));

    }
}
