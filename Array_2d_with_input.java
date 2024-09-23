import java.util.Scanner;

public class Array_2d_with_input {
    public static void main (String [] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hi %s, now you need to tell us how many students are in your class: ", name);
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        // Arrays
        String [] arrayOfStudents = new String [numberOfStudents];
        Double [][] gradeOfStudents = new Double [numberOfStudents][3];
        Double [] finalGradeArray = new Double [numberOfStudents];
        Double [] gradeWeight = new Double [] {0.2, 0.4, 0.4};

        // for loop to get all of the inputs
        for (int i=0; i < arrayOfStudents.length; i++){
            System.out.print("Input the name of the Student n " + (i+1) +": ");
            arrayOfStudents[i] = scanner.nextLine();
            for (int j=0; j < gradeWeight.length; j++){
                System.out.print("Enter de grade of the exam n" + (j+1)+ ":");
                String gradeInput = scanner.nextLine();
                gradeOfStudents[i][j] = Double.parseDouble(gradeInput);
            }
        }

        // for loop to print all of the inputs
        for (int i = 0; i < arrayOfStudents.length; i ++){
            System.out.printf("%s's final grade:", arrayOfStudents[i]);
            Double finalGrade = 0.0;
            for (int j = 0; j < gradeWeight.length; j++){
                finalGrade += gradeOfStudents[i][j] * gradeWeight[j];
            }
            System.out.printf(" %.2f", finalGrade);
            finalGradeArray[i] = finalGrade;
            System.out.println();
        } 
        
        // for loop to sum all of the final grades and calculate the average
        Double sumOfGrade = 0.0;
        for (int i = 0; i < arrayOfStudents.length; i++) {
            sumOfGrade += finalGradeArray[i];
        }

        // Calculate and print the average grade in class
        Double averageGrade = sumOfGrade/arrayOfStudents.length;
        System.out.printf("The average grade of the class is: %.2f", averageGrade);
        syste.out.println();

        scanner.close();
    }
}
