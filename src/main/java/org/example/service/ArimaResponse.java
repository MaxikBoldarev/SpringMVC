package org.example.service;

public class ArimaResponse {
    private String prediction;
    private Double forecastValue;

    // Конструкторы
    public ArimaResponse() {
    }

    public ArimaResponse(String prediction, Double forecastValue) {
        this.prediction = prediction;
        this.forecastValue = forecastValue;
    }

    // Геттеры и сеттеры
    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public Double getForecastValue() {
        return forecastValue;
    }

    public void setForecastValue(Double forecastValue) {
        this.forecastValue = forecastValue;
    }
}
