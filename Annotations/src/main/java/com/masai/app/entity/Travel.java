package com.masai.app.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

public class Travel {
	public void display() {
		System.out.println("In Travel");
	}
	@PostConstruct
	public void post() {
		System.out.println("In post contruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("In pre destroy");
	}
}
