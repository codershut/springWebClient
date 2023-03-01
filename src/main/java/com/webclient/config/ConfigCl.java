package com.webclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class ConfigCl {
	
	@Bean
	public WebClient getWebClient() {
		return WebClient.create();
	}
}
