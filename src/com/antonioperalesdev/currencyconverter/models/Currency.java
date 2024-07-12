package com.antonioperalesdev.currencyconverter.models;

import com.google.gson.ToNumberStrategy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Currency {
    private String baseCurrency;
    private String targetCurrency;
    private double conversionRate;
    private LocalDateTime dateTime;
    private Double initialAmount;
    private Double finalAmount;

    public Currency(CurrencyApi currencyApi){
        this.baseCurrency = currencyApi.base_code();
        this.targetCurrency = currencyApi.target_code();
        this.conversionRate = currencyApi.conversion_rate();
        this.dateTime = LocalDateTime.now();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCode) {
        this.baseCurrency = baseCode;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(Double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public double calculateFinalAmount(double initialAmount){
        this.initialAmount = initialAmount;
        this.finalAmount = initialAmount * this.conversionRate;
        return finalAmount;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Override
    public String toString() {
        return "Fecha y hora: " + dateTime.format(formatter) +
                ", Moneda de origen: " + baseCurrency +
                ", Moneda de destino: " + targetCurrency +
                ", Tasa de cambio: " + conversionRate +
                ", Cantidad de origen: " + initialAmount +
                ", Cantidad de destino: " + finalAmount ;
    }
}
