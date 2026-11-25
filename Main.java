
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Registration Number: ");
        String regNumber = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Module 1 Mark: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter Module 2 Mark: ");
        double mark2 = input.nextDouble();

        System.out.print("Enter Module 3 Mark: ");
        double mark3 = input.nextDouble();

        // Create Student object
        Student student = new Student(
            regNumber, name, age, mark1, mark2, mark3
        );

        // Display student information
        student.displayInformation();

        input.close();
    }
}
