package com.randika.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyCovnersionBean convertCurrency
		(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		Map<String, String> uriVars = new HashMap<>();
		uriVars.put("from", from);
		uriVars.put("to", to);
		
		ResponseEntity<CurrencyCovnersionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8100/currency-exchange/from/{from}/to/{to}",
				CurrencyCovnersionBean.class,
				uriVars
				);
		
		CurrencyCovnersionBean response = responseEntity.getBody();
		
		return new CurrencyCovnersionBean(1l, from, to, response.getConversionMultiple(),
				quantity, quantity.multiply(response.getConversionMultiple()), response.getPort());
	}
}
