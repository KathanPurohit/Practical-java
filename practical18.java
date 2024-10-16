class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    public void setdetails(String name,int age,String phoneNumber,String address,double salary)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
    public void getdetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Address: " + this.address);
    }
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    private String specialization;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @ Override
    public void getdetails() {
        super.getdetails();
        System.out.println("Specialization :" + specialization);
    }
}

class Manager extends Member {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    @ Override
    public void getdetails() {
        super.getdetails();
        System.out.println("Department :" + department);
    }
}


public class practical18 {
    public static void main(String[] args) {
      
        Employee employee = new Employee();
        employee.setdetails("Arham", 19, "6894575902", "Mumbai", 10000);
        employee.setSpecialization("Softy Maker");

       
        Manager manager = new Manager();
        manager.setdetails("Kathan", 19, "9106678890", "Los Angelus", 200000);
        manager.setDepartment("HR");

        
        System.out.println("Employee Details:");
        employee.getdetails();
        employee.printSalary();

       
        System.out.println("\nManager Details:");
        manager.getdetails();
        manager.printSalary();
    }
}
