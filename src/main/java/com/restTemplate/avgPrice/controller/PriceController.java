package com.restTemplate.avgPrice.controller;

import com.restTemplate.avgPrice.DTO.AveragePriceDto;
import com.restTemplate.avgPrice.service.AveragePriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/price")
public class PriceController {
    private final AveragePriceService service;

    public PriceController(AveragePriceService service) {
        this.service = service;
    }

    @GetMapping("/{symbol}")
    private ResponseEntity<AveragePriceDto> getAvgPrice(@PathVariable String symbol){
        return ResponseEntity.ok(service.getAveragePrice(symbol));
    }
}
