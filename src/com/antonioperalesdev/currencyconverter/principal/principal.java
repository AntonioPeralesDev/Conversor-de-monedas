package com.antonioperalesdev.currencyconverter.principal;

import com.antonioperalesdev.currencyconverter.controller.ControllerApi;
import com.antonioperalesdev.currencyconverter.controller.ControllerInput;
import com.antonioperalesdev.currencyconverter.controller.ControllerJson;
import com.antonioperalesdev.currencyconverter.models.Currency;
import com.antonioperalesdev.currencyconverter.models.CurrencyApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        ControllerApi controllerApi = new ControllerApi();
        ControllerJson controllerJson = new ControllerJson();
        ControllerInput controllerInput = new ControllerInput();
        Scanner scanner = new Scanner(System.in);

        List<Currency> currencies = new ArrayList<>();

        int menu;
        String menuDivisas;
        boolean runProgram = true;
        boolean runMainMenu = true;

        try {
            while (runProgram) {
                while (runMainMenu) {
                    menu = controllerInput.getMainMenu();
                    switch (menu) {
                        case 1:
                            try {
                                String baseCurrency = controllerInput.getBaseCurrency();
                                String targetCurrency = controllerInput.getTargetCurrency();

                                String json = controllerApi.getCurrencyInformation(baseCurrency,targetCurrency);

                                CurrencyApi micurrencyApi = controllerJson.gson.fromJson(json, CurrencyApi.class);

                                Currency micurrency = new Currency(micurrencyApi);

                                micurrency.calculateFinalAmount(controllerInput.getDeposit());
                                System.out.println(controllerInput.getResult());
                                System.out.println(micurrency.getFinalAmount());

                                System.out.println(controllerInput.getEnterToContinue());
                                String enter = scanner.nextLine();

                                currencies.add(micurrency);
                            }
                            catch (Exception e){
                                System.out.println(controllerInput.getError());
                            }
                            break;
                        case 2:
                            System.out.println(controllerInput.getConversionHistory());
                            currencies.forEach(System.out::println);

                            System.out.println(controllerInput.getEnterToContinue());
                            String enter = scanner.nextLine();
                            break;
                        case 3:
                            runMainMenu = false;
                            runProgram = false;
                        default:
                            break;
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
