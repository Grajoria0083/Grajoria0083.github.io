package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("app.properties")
public class AppConfigg {

	
	@Bean(value = "theMap")
	public Map<Student, Course> getMap(){
		
		Map<Student, Course> map = new HashMap<Student, Course>();
		
		map.put(new Student(10,"amit","noida","amit@gmail",750), 
				new Course(111,"java","3month",75000));
		map.put(new Student(11,"gaurav","dehli","gautav@gmail",550), 
				new Course(201,"JS","2month",80000));
		map.put(new Student(12,"rohit","pune","rohit@gmail",620), 
				new Course(201,"MERN","4month",90000));
		
		return map;
	}
	
	
	@Bean(value = "theList")
	public List<Student> getStudents(){
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(10,"amit","noida","amit@gmail",750));
		list.add(new Student(11,"gaurav","dehli","gautav@gmail",550));
		list.add(new Student(12,"rohit","pune","rohit@gmail",620));
		list.add(new Student(13,"aman","goa","aman@gmail",780));
		
		return list;
	}
	
}
