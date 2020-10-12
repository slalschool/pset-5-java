import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter three integers.");

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int integer1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int integer2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int integer3 = input3.nextInt();

        if (integer1 == integer2 && integer2 == integer3) {
            System.out.println("\nSame.");
        }

        else {
            int change1 = integer2 - integer1;
            int change2 = integer3 - integer2;

            if (change1 > 0 && change2 > 0) {
                System.out.println("\nStrictly Increasing.");
            }

            else if (change1 < 0 && change2 < 0) {
                System.out.println("\nStrictly Decreasing.");
            }

            else {
                int change3 = integer3 - integer1;

                if (change3 > 0) {
                    System.out.println("\nIncreasing.");
                }

                else if (change3 < 0) {
                    System.out.println("\nDecreasing.");
                }

                else {
                    System.out.println("\nError.");
                }
            }
        }
    }
}
