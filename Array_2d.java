// First I need to import some libraries
// Second I gotta declare some variables containing the information about the students like:
// Name, age and grade


public class arrays_2d {
    public static void printArray(String [] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(int [] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static void main(String []args){
        String [] studentsName = {"Mateus", "Joacas", "Samuka", "John"};
        int [] studentsID = {1423543, 2434523, 2354343, 1236423};
        printArray(studentsName);
        printArray(studentsID);
        double [][] studentsGrade = {{5, 7, 6, 4, 2}, {4, 2, 3, 3, 4}, {3, 5, 6, 10, 9}, {9, 10, 10, 10, 10}}; // Using double because we are gonna have to divide later to get the final grade.
        String [] content = {"Lab1", "Lab2", "Mid Exam", "Lab3", "Final Exam"};
        float [] weight = {0.1f, 0.1f, 0.35f, 0.1f, 0.35f};

        // Now I need to create a for loop inside another loop [i] and [j] to iterate inside the 2d array
        for (int i=0; i < studentsName.length; i++) {
            System.out.printf("Student name: " + studentsName[i] + ", Student ID: " + studentsID[i] + ".\n");
            System.out.print("Grades: \n\n");
            float finalGrade = 0;
            for (int j=0; j < weight.length; j++){
                System.out.printf(content[j] + ": " +  studentsGrade[i][j] + " \n");
                finalGrade += (studentsGrade[i][j] * weight[j]);
            }
        System.out.printf("Final grade is: %.2f\n\n", finalGrade);
        }
        
    }   
}


