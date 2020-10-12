import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a playing card: ");

        String card = input.nextLine().toUpperCase();
        if(card.length() > 2) {
            System.out.print("That's not a valid card.");
        }

        else {
            String rankInput = Character.toString(card.charAt(0));
            String suitInput = Character.toString(card.charAt(1));
            String suit;
            String rank;

            switch(rankInput) {
                case "2":
                    rank = "Two";
                    break;
                case "3":
                    rank = "Three";
                    break;
                case "4":
                    rank = "Four";
                    break;
                case "5":
                    rank = "Five";
                    break;
                case "6":
                    rank = "Six";
                    break;
                case "7":
                    rank = "Seven";
                    break;
                case "8":
                    rank = "Eight";
                    break;
                case "9":
                    rank = "Nine";
                    break;
                case "T":
                    rank = "Ten";
                    break;
                case "J":
                    rank = "Jack";
                    break;
                case "Q":
                    rank = "Queen";
                    break;
                case "K":
                    rank = "King";
                    break;
                case "A":
                    rank = "Ace";
                    break;
                default:
                    rank = "That's not a valid rank.";
                    break;
            }

            switch(suitInput) {
                case "C":
                    suit = "Clubs";
                    break;
                case "H":
                    suit = "Hearts";
                    break;
                case "S":
                    suit = "Spades";
                    break;
                case "D":
                    suit = "Diamonds";
                    break;
                default:
                    suit = "That's not a valid suit.";
            }

            if(rank.length() > 10) {
                System.out.print(rank);
            }

            else if(suit.length() > 10) {
                System.out.print(suit);
            }

            else {
                System.out.println("\n" + rank + " of " + suit + ".");
            }

            input.close();
        }
        }

}