package com.antonioperalesdev.currencyconverter.controller;

import java.util.Scanner;

public class ControllerInput {
    private Scanner scanner;
    public ControllerInput(){
        scanner = new Scanner(System.in);
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public String getCurrenciesMenu() {
        return currenciesMenu;
    }

    public String getDeposit() {
        return deposit;
    }

    public String getResult() {
        return result;
    }

    private String mainMenu = """
            =====================================
                    CONVERSOR DE DIVISAS
            =====================================
            
            1. Convertir divisas
            
            2. Historial de conversiones
            
            3. Salir
            
            =====================================
            """;
    private String currenciesMenu = """
            =====================================
                    CONVERSOR DE DIVISAS
            =====================================
            
            1. USD - Dólar estadounidense
            2. ARS - Peso argentino
            3. BOB - Boliviano
            4. BRL - Real brasileño
            5. CLP - Peso chileno
            6. COP - Peso colombiano
            7. Introducir otra divisa (Código ISO 4217)
            
            =====================================
            """;

    private String deposit = "Ingrese la cantidad a convertir:";

    private String result = "Resultado de la conversión:";

    public String obtainCurrency(){
        System.out.println(currenciesMenu);

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
