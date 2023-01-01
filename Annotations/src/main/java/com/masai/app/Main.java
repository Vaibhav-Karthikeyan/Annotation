package com.masai.app;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.app.config.AppConfig;
import com.masai.app.entity.Bike;
import com.masai.app.entity.Car;
import com.masai.app.entity.Travel;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.getBean(Car.class).display();
		ctx.getBean(Bike.class).display();
		ctx.getBean(Travel.class).display();
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
