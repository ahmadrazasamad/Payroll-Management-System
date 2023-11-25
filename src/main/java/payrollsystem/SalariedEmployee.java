package payrollsystem;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee() { // default
        super();
        weeklySalary = 0.0;
    }

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, String nationalId) { // parameterized
        super(firstName, lastName, nationalId);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary > 0) {
            this.weeklySalary = weeklySalary;
        } else {
            System.out.println("Cannot set a negative value for weekly salary.");
        }
    }
    
    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "\nSalaried Employee:\n" + super.toString();
    }
}