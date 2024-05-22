package com.antonioperalesdev.currencyconverter.controller;

import java.net.http.HttpClient;

public class ControllerApi {
    private HttpClient cliente;

    public ControllerApi() {
        cliente = HttpClient.newHttpClient();
    }


}
