package CodsoftInternship;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello there! Could you please tell me how many subjects you have?");
        int numSubjects = s.nextInt();
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Great! Now, could you please enter the marks you obtained in subject " + (i + 1) + "?");
            marks[i] = s.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        String grade;

        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else if (averagePercentage >= 35) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        System.out.println("You've done well! Here are your results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
