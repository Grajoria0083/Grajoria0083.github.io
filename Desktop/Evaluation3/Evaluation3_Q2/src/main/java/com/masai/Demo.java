package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigg.class);
		StudentService ss = ctx.getBean(StudentService.class);
		ss.printMap();
		ss.printList();
		ss.printAppName();
	}

}
