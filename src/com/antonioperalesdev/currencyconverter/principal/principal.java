package com.antonioperalesdev.currencyconverter.principal;

import com.antonioperalesdev.currencyconverter.controller.ControllerApi;
import com.antonioperalesdev.currencyconverter.controller.ControllerInput;
import com.antonioperalesdev.currencyconverter.controller.ControllerJson;
import com.antonioperalesdev.currencyconverter.models.Currency;
import com.antonioperalesdev.currencyconverter.models.CurrencyApi;

import java.util.ArrayList;
import java.util.List;

public class principal {
    public static void main(String[] args) {
        ControllerApi controllerApi = new ControllerApi();
        ControllerJson controllerJson = new ControllerJson();
        ControllerInput controllerInput = new ControllerInput();

        List<Currency> Currencies = new ArrayList<>();

        try {
            System.out.println(controllerInput.getMainMenu());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*try{
//            String baseCurrency = controllerInput.obtainCurrency();
//            String targetCurrency = controllerInput.obtainCurrency();
//
//            String json = controllerApi.getCurrencyInformation(baseCurrency,targetCurrency);
//            System.out.println(json);
//
//            CurrencyApi micurrencyApi = controllerJson.gson.fromJson(json, CurrencyApi.class);
//            System.out.println(micurrencyApi);
//
//            Currency micurrency = new Currency(micurrencyApi);
//            System.out.println(micurrency.toString());
//
//            String jsonOutput = controllerJson.toJson(micurrency);
//            System.out.println(jsonOutput);
//
//            double finalAmount = micurrency.calculateFinalAmount(25);
//            System.out.println(finalAmount);

            System.out.println(controllerInput.getMainMenu());
        } catch (Exception e){
            e.getMessage();
        }*/
    }
}
