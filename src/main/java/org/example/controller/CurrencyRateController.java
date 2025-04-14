package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.CurrencyRateService;
import org.example.model.CurrencyRate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDate;


@RestController
@RequiredArgsConstructor
@RequestMapping
public class CurrencyRateController {
    public final CurrencyRateService currencyRateService;

    @GetMapping("/currencyRate/{currency}/{date}")
    public String getCurrencyRate(@PathVariable("currency") String currency,
                                              @DateTimeFormat(pattern = "dd-MM-yyyy") @PathVariable("date") LocalDate date) {
        return currencyRateService.getCurrencyRate(currency, date).toString();
    }
}