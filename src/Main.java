import java.util.Scanner;

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
            System.out.println("Exit sequence initiated");
        } else {
            System.out.println("Ticket inputted: " + ticker);
        }
    }
}