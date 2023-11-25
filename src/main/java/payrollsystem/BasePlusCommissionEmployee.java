package payrollsystem;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee() {
        baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(double baseSalary, double commisionRate, double grossSales, String firstName, String lastName, String nationalId) {
        super(commisionRate, grossSales, firstName, lastName, nationalId);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Cannot set a negative value for base salary");
        }
    }
    
    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "\nBase plus Commission employee:" + super.toString();
    }
}