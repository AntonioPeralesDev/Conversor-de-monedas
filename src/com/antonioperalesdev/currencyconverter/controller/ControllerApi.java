package com.antonioperalesdev.currencyconverter.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ControllerApi {
    private HttpClient client;

    public ControllerApi() {
        client = HttpClient.newHttpClient();
    }

    public String getCurrencyInformation(String moneda){

        try {
            String address = "https://v6.exchangerate-api.com/v6/b296a8daf9a59a9f6cc260a5/latest/" +
                    moneda;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }
        catch (Exception e){
            throw new RuntimeException("Error al obtener la tassa de cambio", e);
        }
    }
}
