package com.antonioperalesdev.currencyconverter.controller;

import com.antonioperalesdev.currencyconverter.models.Currency;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ControllerJson {
    public Gson gson;

    public ControllerJson(){
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public String toJson(Currency currency){
        return gson.toJson(currency);
    }
}
