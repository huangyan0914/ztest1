package org.example;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class Test1 {
    public static void main(String[] args) {
//        HttpClients.createDefault();

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        System.out.println(httpClient);
    }
}
