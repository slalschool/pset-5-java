import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        String output;
        output = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "" : " not";

        System.out.println("\n" + year + " is" + output + " a leap year.");

        input.close();
    }
}