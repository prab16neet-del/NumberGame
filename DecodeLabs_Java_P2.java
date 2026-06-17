import java.util.Scanner;

public class DecodeLabs_Java_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("=================================");

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            int marks;

            do {
                System.out.print("Enter Marks for Subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
                }

            } while (marks < 0 || marks > 100);

            totalMarks += marks;
        }

        double percentage = (double) totalMarks / subjects;

        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n !!RESULT!!");
        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Percentage  : %.2f%%\n", percentage);
        System.out.println("Grade       : " + grade);

        if (percentage >= 40) {
            System.out.println("Status      : PASS");
        } else {
            System.out.println("Status      : FAIL");
        }


        sc.close();
    }
}