class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Method to get yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give raise
    public void giveRaise(double percent) {
        monthlySalary += monthlySalary * percent / 100;
    }
}

public class practical13_2 {
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 4000);

        // Displaying each Employee's yearly salary
        System.out.printf("%s %s Yearly Salary: $%,.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s Yearly Salary: $%,.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Giving each Employee a 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Displaying each Employee's yearly salary after the raise
        System.out.println("After 10% raise:");
        System.out.printf("%s %s Yearly Salary: $%,.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s Yearly Salary: $%,.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}
