package payrollsystem;

public class HourlyEmployee extends Employee {

    private double wages, hours;

    public HourlyEmployee() { // default
        wages = 0.0;
        hours = 0.0;
    }

    public HourlyEmployee(double wages, double hours, String firstName, String lastName, String nationalId) { // parameterized
        super(firstName, lastName, nationalId);
        this.wages = wages;
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public double getHours() {
        return hours;
    }

    public void setWages(double wages) {
        if (wages > 0) {
            this.wages = wages;
        } else {
            System.out.println("Cannot set a negative value for wages");
        }
    }

    public void setHours(double hours) {
        if (hours > 0) {
            this.hours = hours;
        } else {
            System.out.println("Cannot set a negative value for hour");
        }
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return wages * hours;
        } else {
            return 40 * wages + (hours - 40) * wages * 1.5;
        }
    }

    @Override
    public String toString() {
        return "\nHourly Employees:\n" + super.toString();
    }
}
