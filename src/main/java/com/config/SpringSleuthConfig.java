package com.config;

import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class SpringSleuthConfig {

	Sampler strartEmpr() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
