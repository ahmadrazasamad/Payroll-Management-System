package payrollsystem;

public class Employee { // parent
    private String firstName, lastName, nationalId;
   
    public Employee() {
        firstName = "";
        lastName = "";
        nationalId = "";
    }

    public Employee(String firstName, String lastName, String nationalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    
    public double earnings() {
        return 0.00;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + "\nLast name: " + lastName + "\nCNIC: " + nationalId;
    }
}