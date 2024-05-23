package com.antonioperalesdev.currencyconverter.models;

public record CurrencyApi(String base_code, String target_code, double conversion_rate) {
}
