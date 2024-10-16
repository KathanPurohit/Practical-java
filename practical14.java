import java.util.Scanner;

class Data {
    int date;
    int month;
    int year;

    Data() {
        // Initialize instance variables if needed
        this.date = 0;
        this.month = 0;
        this.year = 0;
    }

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        this.date = sc.nextInt();
        System.out.println("Enter the month: ");
        this.month = sc.nextInt();
        System.out.println("Enter the year: ");
        this.year = sc.nextInt();
    }

    public void set() {
        System.out.println("The date is: " + this.date);
        System.out.println("The month is: " + this.month);
        System.out.println("The year is: " + this.year);
    }

    public void display() {
        System.out.println(this.date + "/" + this.month + "/" + this.year);
    }
}

public class practical14 {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.get();
        d1.set();
        d1.display();
    }
}

