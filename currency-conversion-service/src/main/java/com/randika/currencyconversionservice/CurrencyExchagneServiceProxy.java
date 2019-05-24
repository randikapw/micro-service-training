package com.randika.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="netflix-zuul-api-gateway-server") //server name changed to zuul API manager name for rest requests.
@RibbonClient(name="currency-exchange-service") //currency-exchange-service should be pointed ribbon as same as
												// previous coz client side load balancing is happening for the
												// servers registered to the name 'currency-exchange-service'
public interface CurrencyExchagneServiceProxy {

	@GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyCovnersionBean retrieveExchangeValue
		(@PathVariable String from,@PathVariable String to);
}
