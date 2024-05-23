package com.antonioperalesdev.currencyconverter.controller;

import java.util.Scanner;

public class ControllerInput {
    private Scanner scanner;

    public ControllerInput(){
        scanner = new Scanner(System.in);
    }

    public String obtainCurrency(){
        System.out.println("Elija una divisa: " +
                "\n1. USD: Dólar de los Estados Unidos" +
                "\n2. EUR: Euro" +
                "\n3. GBP: Libra Esterlina" +
                "\n4. MXN: Peso Mexicano" +
                "\n5. COP: Peso Colombiano" +
                "\n6. ARS: Peso Argentino" +
                "\no Introduzca moneda diferente en codigo ISO 4217");

        String seleccion = scanner.next();

        return eleccion(seleccion);
    }

    public String eleccion(String seleccion){
        String currency = seleccion;

        try {
            int seleccionNumber = Integer.parseInt(seleccion);

            switch (seleccionNumber){
                case 1: currency = "USD";
                    break;
                case 2: currency = "EUR";
                    break;
                case 3: currency = "GBP";
                    break;
                case 4: currency = "MXN";
                    break;
                case 5: currency = "COP";
                    break;
                case 6: currency = "ARS";
                    break;
                default:
                    break;
            }
        } catch (Exception e){
            currency = seleccion;
        }

        return currency;
    }
}
