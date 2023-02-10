import com.google.gson.Gson;

import java.io.IOException;
import java.net.*;
import java.util.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Receive user input
        Scanner input = new Scanner(System.in);
        System.out.println("What ticker would like info on? (Enter \"EXIT\" to stop): ");
        String ticker = input.next();
        //System.out.println("Ticket inputted: " + ticker);

      continueOrExit(ticker);
    }

    //See if they inputted a ticker or want to exit
    public static void continueOrExit(String ticker) throws IOException, InterruptedException {
        if (ticker.equals("EXIT")) {
            //Exit sequence
            System.out.println("Thank you! Goodbye!");
        } else {
            //Make the API call
            apiCAll(ticker);
        }
    }

    public static void apiCAll(String ticker) throws IOException, InterruptedException {
       // System.out.println("API call for ticker: " + ticker);

        String apiKey = "HOQ79Q7MW5T7G7PR";

        var uri = URI.create("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=" + ticker + "&interval=5min&outputsize=compact&apikey=" + apiKey);

        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .timeout(Duration.ofSeconds(10))
                .build();

        HttpResponse<String> getResponse = client.send (
                request,
                HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)
        );

        System.out.println(getResponse.body());

//        var response = getResponse.body();
//        Gson gson = new Gson();
//
//        Info info = gson.fromJson(getResponse.body(), Info.class);


        }
    }