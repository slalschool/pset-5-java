import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double grade = input.nextDouble();

        grade = Math.round(grade);
        String output;

        if(grade > 100) {
            output = "Grades above 100 are invalid.";
        }
        else if(grade < 0) {
            output = "Grades below 0 are invalid.";
        }
        else if(grade >= 90) {
            output = "You received an A.";
        }
        else if(grade >= 80) {
            output = "You received a B.";
        }
        else if(grade >= 70) {
            output = "You received a C.";
        }
        else if(grade >= 60) {
            output = "You received a D.";
        }
        else {
            output = "You received an F.";
        }

        System.out.println("\n" + output);

        input.close();
    }

}