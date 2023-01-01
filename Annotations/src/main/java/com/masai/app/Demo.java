package com.masai.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.app.config.Config;
import com.masai.app.entity.Student;
import com.masai.app.service.StudentService;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
		 System.out.println(ctx.getBean("c1"));
		 StudentService s = ctx.getBean(StudentService.class);
		 s.display();
		((AnnotationConfigApplicationContext) ctx).close();
	}


}
