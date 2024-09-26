// Create a program that gets these input from the user:
// Number of students
// Student ID
// Grades
// And calculate the Final grade (use different weights) an also the average grade of the class

import java.util.Scanner;

public class Main_6 {
    public static void main (String [] args) {
        // Getting inital input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input how many students are in your class:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        // Declaring the arrays
        String [] nameOfStudentsArray = new String [numberOfStudents];
        int [] idOfStudents = new int [numberOfStudents];
        String [] descriptionOfCourse = {"Lab1", "Mid-Exam", "Final-Exam"};
        double [][] studentsGrades = new double[numberOfStudents][descriptionOfCourse.length];
        double [] finalGradeArray = new double [numberOfStudents];
        double [] gradeWeight = {0.2, 0.4, 0.4};

        // Get the personal information
        for (int i=0; i < numberOfStudents; i++){
            System.out.print("Input the name of the student n" + (i+1) + ": ");
            nameOfStudentsArray[i] = scanner.nextLine();
            System.out.print("Input the ID of the same student: ");
            idOfStudents[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Get the grades
        for (int i=0; i<numberOfStudents; i++){
            System.out.print("Input " + nameOfStudentsArray[i] + "'s grades in the following.\n");
            for (int j=0; j<descriptionOfCourse.length; j++ ){
                System.out.print("Input the grade of " + descriptionOfCourse[j] + ": ");
                double grade = scanner.nextDouble();
                studentsGrades[i][j] = grade;
                scanner.nextLine();
            }
        }
        // Caculate the final grade per student
        for (int i=0; i<numberOfStudents; i++){
            double finalGrade = 0;
            for (int j=0; j<descriptionOfCourse.length; j++){
                finalGrade += studentsGrades[i][j]*gradeWeight[j];
                finalGradeArray[i] = finalGrade;  
            }
        System.out.printf("The final grade of %s is %.2f\n", nameOfStudentsArray[i], finalGradeArray[i]);
        }

        // Calculate the average score of the class
        double finalGradeTotalSum = 0;
        for (int i = 0; i<finalGradeArray.length; i++) {
            finalGradeTotalSum += finalGradeArray[i];
        }
        double averageFinalGrade = finalGradeTotalSum/finalGradeArray.length;
        System.out.printf("The average grade is %.2f: \n", averageFinalGrade);
    }
}
