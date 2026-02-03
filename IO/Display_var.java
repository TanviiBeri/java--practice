package IO;

public class Display_var {
    public static void main(String[] args) {

        // Concatenate first name and last name
        String fName = "SIT";
        String lName = "College";
        String fullName = fName + " " + lName;
        System.out.println("Full name: " + fullName);

        // Student data
        String sName = "Rubics Cube";
        int sID = 15;
        int sAge = 23;
        float sFee = 21.43f;
        char sGrade = 'B';

        // Print variables with proper labels
        System.out.println("Student name: " + sName);
        System.out.println("Student ID: " + sID);
        System.out.println("Student age: " + sAge);
        System.out.println("Student fee: " + sFee);
        System.out.println("Student grade: " + sGrade);
    }
}
