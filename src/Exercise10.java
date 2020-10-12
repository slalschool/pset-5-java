import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter wage: ");
        double wage = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        double hours = input2.nextDouble();

        if(wage < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
        }

        else if(hours < 0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0.");
        }

        else {
            double pay = (hours <= 40) ? hours * wage : (40 * wage) + ((hours - 40) * wage * 1.5);
            System.out.println("\nYou'll make $" + pay + " this week.");
        }

        input1.close();
        input2.close();
    }
}