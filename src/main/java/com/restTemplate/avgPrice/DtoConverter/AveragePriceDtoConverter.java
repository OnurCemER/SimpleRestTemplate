package com.restTemplate.avgPrice.DtoConverter;

import com.restTemplate.avgPrice.DTO.AveragePriceDto;
import com.restTemplate.avgPrice.model.AveragePriceModel;
import org.springframework.stereotype.Component;

@Component
public class AveragePriceDtoConverter {
    public AveragePriceDto convert(AveragePriceModel model){
        return new AveragePriceDto(model.getMins(), model.getPrice(), model.getSymbol());
    }
}
