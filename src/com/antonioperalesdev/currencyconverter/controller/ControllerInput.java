package com.antonioperalesdev.currencyconverter.controller;

import java.util.Scanner;

public class ControllerInput {
    private Scanner scanner;
    public ControllerInput(){
        scanner = new Scanner(System.in);
    }

    public int getMainMenu() {
        System.out.println(mainMenu);;
        return scanner.nextInt();
    }

    public String getBaseCurrency() {
        System.out.println(baseCurrency);

        String seleccion = scanner.next();

        return eleccion(seleccion);
    }

    public String getTargetCurrency() {
        System.out.println(targetCurrency);

        String seleccion = scanner.next();

        return eleccion(seleccion);
    }

    public int getDeposit() {
        System.out.println(deposit);
        return scanner.nextInt();
    }

    public String getResult() {
        return result;
    }

    public String getEnterToContinue() {
        return enterToContinue;
    }

    public String getError() {
        return error;
    }

    public String getConversionHistory() {
        return conversionHistory;
    }

    private String mainMenu = """
            =====================================
                    Conversor de Divisas
            =====================================
            1. Convertir divisas
            2. Historial de conversiones
            3. Salir
            =====================================
            Seleccione una opción (1-3):
            """;
    private String baseCurrency = """
            =====================================
                   Obtener Moneda de Origen
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
    private String targetCurrency = """
            =====================================
                  Obtener Moneda de Destino
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

    private String deposit = """
            =====================================
               Ingrese la Cantidad a Convertir
            =====================================""";

    private String result = """
            =====================================
                  Resultado de la Conversión
            =====================================""";


    private String enterToContinue = """
            =====================================
                Presione enter para continuar
            =====================================
            """;

    private String error = """
            =====================================
             Error en la ejecución del programa
            =====================================
            """;

    private String conversionHistory = """
            =====================================
                  Historial de conversiones
            """;

    public String obtainCurrency(){
        System.out.println(baseCurrency);

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
