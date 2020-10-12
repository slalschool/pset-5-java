import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = input.nextLine().toUpperCase();

        String output;
        switch(month) {
            case "FEBRUARY":
                output = "28 or 29 days.";
                break;

            case "APRIL": case "JUNE": case "SEPTEMBER": case "NOVEMBER":
                output = "30 days.";
                break;

            case "JANUARY": case "MARCH": case "MAY": case "JULY":
            case "AUGUST": case "OCTOBER": case "DECEMBER":
                output = "31 days.";
                break;

            default:
                output = "That's not a valid month.";
                break;
        }

        System.out.println("\n" + output);

        input.close();
    }
}