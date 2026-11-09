public class Employee {

    String name;
    int hoursWorked;
    double payRate;

    public Employee(String name, int hoursWorked, double payRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getTotalPay() {
        double totalPay = this.hoursWorked * this.payRate;
        return totalPay;
    }

    public int getRegularHours() {

        if(this.hoursWorked > 40) {
            return 40;
        }
        else {
            return this.hoursWorked;
        }
    }

    public int getOvertimeHours() {
        if(this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        else {
            return 0;
        }
    }

}