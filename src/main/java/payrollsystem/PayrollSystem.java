package payrollsystem;

import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Employee[] emp = new Employee[5];
        // upcasting
        emp[0] = new SalariedEmployee(800.00, "Usman", "Ali", "111-11-1111"); // 1st employee
        emp[1] = new CommissionEmployee(9500.0, 0.06, "Atif", "Aslam", "222-22-2222"); // 2nd employee
        emp[2] = new BasePlusCommissionEmployee(5000, 0.04, 300, "Rana", "Naseeb", "333-33-3333"); // 3rd employee
        emp[3] = new HourlyEmployee(16.75, 40, "Renson", "Isaac", "444-44-4444"); // 4th employee
        emp[4] = new SalariedEmployee(1000.00, "Aarib Bhai", "Talha Baig", "000-00-0007"); // 5tn employee

        System.out.println("Details of all the hired employees are: ");
        for (Employee e : emp) {
            System.out.println(e); // actuallly we are here calling e.toString()
            System.out.println(e.earnings());
        }

        char option; // for continuing the loop
        do {
            System.out.print("\nPlease select the employee number (1, 2, 3, 4, or 5) for whom you would like to propose a salary or wage increase: ");
            int choice = read.nextInt();
            double increamentPercent;
            switch (choice) {
                case 1:
                    SalariedEmployee currentEmp1 = (SalariedEmployee) emp[0]; // downcasting
                    double oldSalary1 = currentEmp1.getWeeklySalary(); // getting old weekly salary
                    System.out.println("Old weekly salary: " + oldSalary1);

                    System.out.print("Please specify the percentage by which you would like to increase the salary: ");
                    increamentPercent = read.nextDouble(); // getting input
                    increamentPercent = (increamentPercent / 100) + 1;
                    currentEmp1.setWeeklySalary(increamentPercent * oldSalary1); // setting new weekly salary
                    System.out.println("New weekly salary with " + ((increamentPercent - 1) * 100) + "% increase is: " + currentEmp1.getWeeklySalary());
                    break;
                case 2:
                    CommissionEmployee currentEmp2 = (CommissionEmployee) emp[1]; // downcasting
                    double oldSalary2 = currentEmp2.getCommisionRate(); // getting old Commision rate
                    System.out.println("Old commision rate: " + oldSalary2);

                    System.out.print("Please specify the percentage by which you would like to increase the commision rate: ");
                    increamentPercent = read.nextDouble(); // getting input
                    increamentPercent = (increamentPercent / 100) + 1;
                    currentEmp2.setCommisionRate(increamentPercent * oldSalary2); // setting new commision rate
                    System.out.println("New commision rate with " + ((increamentPercent - 1) * 100) + "% increase is: " + currentEmp2.getCommisionRate());
                    break;
                case 3:
                    BasePlusCommissionEmployee currentEmp3 = (BasePlusCommissionEmployee) emp[2]; // downcasting
                    double oldSalary3 = currentEmp3.getBaseSalary(); // getting old base salary
                    System.out.println("Old base salary: " + oldSalary3);

                    System.out.print("Please specify the percentage by which you would like to increase the base salary: ");
                    increamentPercent = read.nextDouble(); // getting input
                    increamentPercent = (increamentPercent / 100) + 1;
                    currentEmp3.setBaseSalary(increamentPercent * oldSalary3); // setting new base salary
                    System.out.println("New base salary with " + ((increamentPercent - 1) * 100) + "% increase is: " + currentEmp3.getBaseSalary());
                    break;
                case 4:
                    HourlyEmployee currentEmp4 = (HourlyEmployee) emp[3]; // downcasting
                    double oldSalary4 = currentEmp4.getWages(); // getting old wages
                    System.out.println("Old hourly wage : " + oldSalary4);

                    System.out.print("Please specify the percentage by which you would like to increase the wage: ");
                    increamentPercent = read.nextDouble(); // getting input
                    increamentPercent = (increamentPercent / 100) + 1;
                    currentEmp4.setWages(increamentPercent * oldSalary4); // setting new salary
                    System.out.println("New hourly wage with " + ((increamentPercent - 1) * 100) + "% increase is:" + currentEmp4.getWages());
                    break;
                case 5:
                    SalariedEmployee currentEmp5 = (SalariedEmployee) emp[4]; // downcasting
                    double oldSalary5 = currentEmp5.getWeeklySalary(); // getting old salary
                    System.out.println("Old weekly salary: " + oldSalary5);

                    System.out.print("Please specify the percentage by which you would like to increase the salary: ");
                    increamentPercent = read.nextDouble(); // getting input
                    increamentPercent = (increamentPercent / 100) + 1;
                    currentEmp5.setWeeklySalary(increamentPercent * oldSalary5); // setting new salary
                    System.out.println("New weekly salary with " + ((increamentPercent - 1) * 100) + "% increase is:" + currentEmp5.getWeeklySalary());
                    break;
                default:
                    System.out.println("Wrong Input");
            }
            System.out.print("Would you like to proceed with increasing the salary, wage, or commission rate of another employee? Please press 'Y' to continue or any other key to indicate your decision not to proceed: ");
            read.nextLine(); // for input buffer
            option = read.nextLine().toLowerCase().charAt(0);
        } while (option == 'y');
    }
}