import java.util.Scanner;

class Student {
    int rollNumber;
    String name;

    void getStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

class Exam extends Student {
    int[] marks = new int[6];

    void getMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    void displayMarks() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Marks for subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

class Result extends Exam {
    int total_marks;

    void calculateTotalMarks() {
        total_marks = 0;
        for (int mark : marks) {
            total_marks += mark;
        }
    }

    void displayResult() {
        displayStudentDetails();
        displayMarks();
        System.out.println("Total Marks: " + total_marks);
    }
}

public class examples {
    public static void main(String[] args) {
        Result result = new Result();
        result.getStudentDetails();
        result.getMarks();
        result.calculateTotalMarks();
        result.displayResult();
    }
}

