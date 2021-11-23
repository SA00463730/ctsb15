package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.api.JapaneseConvertor;
import com.demo.api.MessageConvertor;

@Configuration
public class MessageConsumerConfig {

	@Bean
	public MessageConvertor messageConvertor() {
		return new JapaneseConvertor();
	}
	
}
