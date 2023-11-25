package payrollsystem;

public class CommissionEmployee extends Employee {

    private double grossSales, commisionRate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double commisionRate, double grossSales, String firstName, String lastName, String nationalId) {
        super(firstName, lastName, nationalId);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales > 0) {
            this.grossSales = grossSales;
        } else {
            System.out.println("Cannot set a negative value for gross sales");
        }
    }

    public void setCommisionRate(double commisionRate) {
        if (commisionRate > 0) {
            this.commisionRate = commisionRate;
        } else {
            System.out.println("Cannot set a negative value for commision rate");
        }
    }

    @Override
    public double earnings() {
        return grossSales * commisionRate;
    }

    @Override
    public String toString() {
        return "\nCommission employee:\n" + super.toString();
    }
}
