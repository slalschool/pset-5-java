import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        String output = (integer % 2 == 0) ? "Even." : "Odd";

        System.out.println("\n" + output);
        input.close();
    }
}