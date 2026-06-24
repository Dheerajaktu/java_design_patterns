package org.java.java11Features;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientApi {

    /*
    * https://jsonplaceholder.typicode.com/users
    * */

    public static void main(String[] args) {

        String EXTERNAL_API = "https://jsonplaceholder.typicode.com/users";

          HttpClient client = HttpClient.newHttpClient();


        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(EXTERNAL_API))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("API RESPONSE===>>"+response.body());


    }
}
