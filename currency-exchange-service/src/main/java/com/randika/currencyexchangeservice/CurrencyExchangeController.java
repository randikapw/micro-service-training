package com.randika.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired //Auto wiring framework component
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue
		(@PathVariable String from,@PathVariable String to) {
		
		ExchangeValue exchangeValue = 
				new ExchangeValue(from,to,1000l,BigDecimal.valueOf(65));
		exchangeValue.setPort(
				Integer.parseInt(environment.getProperty("server.port")));
		
		return exchangeValue;
	}
}
