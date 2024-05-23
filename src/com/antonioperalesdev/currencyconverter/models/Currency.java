package com.antonioperalesdev.currencyconverter.models;

public class Currency {
    private String baseCode;
    private String targetCode;
    private double conversionRate;

    public Currency(CurrencyApi currencyApi){
        this.baseCode = currencyApi.base_code();
        this.targetCode = currencyApi.target_code();
        this.conversionRate = currencyApi.conversion_rate();
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }
}
