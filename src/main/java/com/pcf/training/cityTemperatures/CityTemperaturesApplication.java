package com.pcf.training.cityTemperatures;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(value = "com.pcf.training.cityTemperatures.entities")
@ComponentScan(value = "com.pcf.training.cityTemperatures")
public class CityTemperaturesApplication {

	@Bean
	public Cloud cloud() {
		return new CloudFactory().getCloud();
	}

	@Bean
	public DataSource dataSource() {
		return cloud().getSingletonServiceConnector(DataSource.class, null);
	}

	public static void main(String[] args) {
		SpringApplication.run(CityTemperaturesApplication.class, args);
	}
}
