package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class App {
    public static void main(String[] args ) {
        String response = Request();
        Something(response);
    }

    public static String Request() {
        String url = "https://mockbin.org/bin/fd9103a1-81dc-4a5d-88c3-dd9f8eaf2661";
        InputStream response = null;
        
        try {
            response = new URL(url).openStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String responseBody = null;

        try (Scanner scanner = new Scanner(response)) {
            responseBody = scanner.useDelimiter("\\A").next();
        }

        System.out.println(responseBody);

        return responseBody;
    }

    public static void Something(String args) {

    }
}
