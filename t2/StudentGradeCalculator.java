import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();

        // Calculate
        double total = subject1 + subject2 + subject3;
        double average = total / 3;

        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}