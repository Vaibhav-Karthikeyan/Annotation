package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.app.config.JdbcConfig;
import com.masai.app.service.StuSer;

public class jdbc {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(JdbcConfig.class);
		StuSer s=ctx.getBean(StuSer.class);
		s.addStudent();
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
