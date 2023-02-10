import java.util.*;
import java.net.*;
public class Main {
    public static void main(String[] args) {

        //Receive user input
        Scanner input = new Scanner(System.in);
        System.out.println("What ticker would like info on? (Enter \"EXIT\" to stop): ");
        String ticker = input.next();
        //System.out.println("Ticket inputted: " + ticker);

      continueOrExit(ticker);
    }

    //See if they inputted a ticker or want to exit
    public static void continueOrExit(String ticker) {
        if (ticker.equals("EXIT")) {
            //Exit sequence
            System.out.println("Thank you! Goodbye!");
        } else {
            //Make the API call
            apiCAll(ticker);
        }
    }

    public static void apiCAll(String ticker) {
       // System.out.println("API call for ticker: " + ticker);

            }
        }