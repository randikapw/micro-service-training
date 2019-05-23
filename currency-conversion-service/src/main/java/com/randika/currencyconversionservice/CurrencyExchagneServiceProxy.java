package com.randika.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-conversion-service", url="localhost:8000")
public interface CurrencyExchagneServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyCovnersionBean retrieveExchangeValue
		(@PathVariable String from,@PathVariable String to);
}
