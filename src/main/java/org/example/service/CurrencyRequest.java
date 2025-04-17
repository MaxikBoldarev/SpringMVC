package org.example.service;

import java.time.LocalDate;

public class CurrencyRequest {
    private String currency;
    private LocalDate date;
    private Double rate;

    // Конструкторы
    public CurrencyRequest() {
    }

    public CurrencyRequest(String currency, LocalDate date, Double rate) {
        this.currency = currency;
        this.date = date;
        this.rate = rate;
    }

    // Геттеры и сеттеры
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
