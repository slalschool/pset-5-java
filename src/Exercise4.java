import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = input.nextLine().toUpperCase();

        String output;
        switch (grade) {
            case "A+":
                output = "Your GPA is a 4.00.";
                break;
            case "A":
                output = "Your GPA is a 4.00.";
                break;
            case "A-":
                output = "Your GPA is a 3.67.";
                break;
            case "B+":
                output = "Your GPA is a 3.33.";
                break;
            case "B":
                output = "Your GPA is a 3.00.";
                break;
            case "B-":
                output = "Your GPA is a 2.67.";
                break;
            case "C+":
                output = "Your GPA is a 2.33.";
                break;
            case "C":
                output = "Your GPA is a 2.00.";
                break;
            case "C-":
                output = "Your GPA is a 1.67.";
                break;
            case "D+":
                output = "Your GPA is a 1.33.";
                break;
            case "D":
                output = "Your GPA is a 1.00.";
                break;
            case "D-":
                output = "Your GPA is a 0.67.";
                break;
            case "F":
                output = "Your GPA is a 0.00.";
                break;
            default:
                output = "That's not a valid letter grade.";
                break;
        }

        System.out.println("\n" + output);
        input.close();
    }

}