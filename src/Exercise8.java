import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String temp = input.nextLine();
        temp = temp.trim();

        double temperature = Double.parseDouble(temp.substring(0, temp.length() - 1).trim());
        String scale = Character.toString(temp.charAt(temp.length() - 1)).toUpperCase();

        String output;
        if(scale.equals("F")) {
            if(temperature >= 212) {
                output = "Gas";
            }

            else if(temperature >= 32) {
                output = "Liquid";
            }

            else {
                output = "Solid";
            }
        }

        else if(scale.equals("C")) {
            if(temperature >= 100) {
                output = "Gas";
            }

            else if(temperature >= 0) {
                output = "Liquid";
            }

            else {
                output = "Solid";
            }
        }

        else {
            output = "That's not a valid scale.";
        }

        System.out.println("\n" + output);

        input.close();
    }
}