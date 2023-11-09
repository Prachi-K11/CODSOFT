package task_2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int noOfSubjects = sc.nextInt();

        double totalMarks = 0;

        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            double subjectMarks = sc.nextDouble();
            totalMarks += subjectMarks;
        }

        double avgPercent = (totalMarks / (noOfSubjects * 100)) * 100;

        String grade = calculateGrade(avgPercent);
        System.out.println("\nTotal Marks: " + totalMarks+ "out of"+ noOfSubjects*100);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercent);
        System.out.println("Grade: " + grade);

        sc.close();
    }


    public static String calculateGrade(double avgPercent) {
        if (avgPercent >= 90) {
            return "A+";
        } else if (avgPercent >= 80) {
            return "A";
        } else if (avgPercent >= 70) {
            return "B";
        } else if (avgPercent >= 60) {
            return "C";
        } else if (avgPercent >= 50) {
            return "D";
        } else {
            return "F";
        }
	}

}
