package com.timbuchalka.springdemo;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan(basePackages = "com.timbuchalka.springdemo")
@PropertySource(value = { "classpath:properties/organization.properties" })
public class PropertyConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
