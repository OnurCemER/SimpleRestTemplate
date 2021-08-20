package com.restTemplate.avgPrice.service;

import com.restTemplate.avgPrice.DTO.AveragePriceDto;
import com.restTemplate.avgPrice.DtoConverter.AveragePriceDtoConverter;
import com.restTemplate.avgPrice.model.AveragePriceModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AveragePriceService {

    private final RestTemplate restTemplate;
    private final AveragePriceDtoConverter converter;

    public AveragePriceService(RestTemplate restTemplate, AveragePriceDtoConverter converter) {
        this.restTemplate = restTemplate;
        this.converter = converter;
    }

    public AveragePriceDto getAveragePrice(String symbol) {
        AveragePriceModel model = restTemplate.getForObject("https://api1.binance.com/api/v3/avgPrice?symbol="+symbol, AveragePriceModel.class);
        model.setSymbol(symbol);
        return converter.convert(model);
    }
}
