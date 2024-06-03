package com.antonioperalesdev.currencyconverter.models;

import java.time.LocalDateTime;

public class Currency {
    private String baseCurrency;
    private String targetCurrency;
    private double conversionRate;
    private LocalDateTime dateTime;

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

    public double calculateFinalAmount(double initialAmount){
        return initialAmount * conversionRate;
    }
}
