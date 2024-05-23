package com.antonioperalesdev.currencyconverter.controller;

import java.util.Scanner;

public class ControllerInput {
    private Scanner scanner;

    public ControllerInput(){
        scanner = new Scanner(System.in);
    }

    public String obtainCurrency(){
        System.out.println("Elija una divisa: " +
                "\n1. USD: Dólar Estadounidense" +
                "\n2. ARS: Peso Argentino" +
                "\n3. BOB: Peso Boliviano" +
                "\n4. BRL: Real Brasileño" +
                "\n5. CLP: Peso Chileno" +
                "\n6. COP: Peso Colombiano" +
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
                case 2: currency = "ARS";
                    break;
                case 3: currency = "BOB";
                    break;
                case 4: currency = "BRL";
                    break;
                case 5: currency = "CLP";
                    break;
                case 6: currency = "COP";
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
