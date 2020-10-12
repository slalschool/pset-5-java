import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        String output;

        if(integer == 0) {
            output = "Zero.";
        }

        else {
            output = (integer < 0) ? "Negative." : "Positive.";
        }

        System.out.println("\n" + output);

        input.close();
    }
}
