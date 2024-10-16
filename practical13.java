import java.util.*;
public class practical13 {
    public static void main(String args[])
    {
        Employee e1 = new Employee(); 
   
        Employee e2 = new Employee();
        e1.get();
        e2.get();
        e1.put();
        e2.put();
        e1.yearlysalary();
        e2.yearlysalary();
        e1.raise(10);
        e2.raise(10);

    }
    
}
 class Employee{
    String F_name;
    String L_name;
    double monthly_salary;
    Employee()
    {
        F_name = this.F_name;
        L_name = this.L_name;
        monthly_salary = 0;
    }
    public void get()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        this.F_name=sc.nextLine();
        System.out.println("Enter your Last name : ");
        this.L_name=sc.nextLine();
        System.out.println("Enter your monthly salary : $");
        monthly_salary=sc.nextDouble();
        if(monthly_salary <= 0)
        {
            monthly_salary = 0.0;
        }
    }
   public void put()
    {
        System.out.println("Your first name : "+ this.F_name);
        System.out.println("Your last name : "+ this.L_name);
        System.out.println("Your monthly salary :$"+ monthly_salary);
    }
    public void yearlysalary()
    {
        double Yearlysalary = monthly_salary*12;
        System.out.println("Your yearly salary : $"+ Yearlysalary);
    }
    public void raise(int r)
    {
        monthly_salary += monthly_salary * r/100; 
        System.out.println("New salary after raise : $"+ monthly_salary);
    }

}
