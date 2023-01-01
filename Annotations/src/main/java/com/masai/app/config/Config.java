package com.masai.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.masai.app.entity.Student;

@Configuration
@ComponentScan(basePackages="com.masai")
public class Config {
	@Bean("c1")
	public List<String> newCity() {
		List<String> city= new ArrayList<>();
		city.add("Chennai");
		city.add("Mumbai");
		city.add("Banglore");
		city.add("Delhi");
		city.add("Kolkata");
		return city;
	}
	

}
