package org.example.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class WebArima {
    private static final URI ARIMA_SERVICE_URL = URI.create("http://arima-service/r-arima");

    public ResponseEntity<ArimaResponse> sendRequest(RestTemplate restTemplate, CurrencyRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CurrencyRequest> entity = new HttpEntity<>(request, headers);
        return restTemplate.postForEntity(ARIMA_SERVICE_URL, entity, ArimaResponse.class);
    }
}
