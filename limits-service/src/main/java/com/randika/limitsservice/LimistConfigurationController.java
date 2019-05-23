package com.randika.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.randika.limitsservice.bean.LimitConfiguration;

@RestController
public class LimistConfigurationController {
	
	@Autowired
	private Configurations configurations;
	
	@GetMapping("/limits")
	public LimitConfiguration retreiveLimistFromConfigurations() {
		return new LimitConfiguration(configurations.getMaximum(), configurations.getMinimum());
	}

}
