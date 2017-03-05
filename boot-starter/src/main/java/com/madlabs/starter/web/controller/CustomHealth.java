package com.madlabs.starter.web.controller;

import java.util.Date;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomHealth implements HealthIndicator {

	@Override
	public Health health() {
		try {
			RestTemplate rest = new RestTemplate();
			rest.getForObject("https://api.github.com/", String.class);
			return Health.up().withDetail("GitHub", "").build();
		} catch (Exception e) {
			return Health.down().withDetail("error", e.getMessage()).build();
		}
	}

}

@Component
class EmpAppHealth implements HealthIndicator {

	@Override
	public Health health() {
		try {
			return Health.up().withDetail("EmpAPP", new Date()).build();
		} catch (Exception e) {
			return Health.down().withDetail("error", e.getMessage()).build();
		}
	}

}
