package com.antonioperalesdev.currencyconverter.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ControllerJson {
    public Gson gson;

    public ControllerJson(){
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }
}
