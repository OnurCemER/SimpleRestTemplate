package com.restTemplate.avgPrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.awt.geom.RectangularShape;

@SpringBootApplication
public class AvgPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvgPriceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
