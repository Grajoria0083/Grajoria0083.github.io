package com.masai;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	
	@Autowired
	private Map<Student, Course> theMap; // inject 3 entries with valid details
	
	@Autowired
	private List<Student> theList; //inject List of 5 Student object
	
	@Value("${appName}")
	private String appname; //inject the AppName from the properties file
	//Hint: Make use of @Bean annotation to inject theMap and theList;
	
	public void printMap(){
		
		System.out.println(theMap);
		
	}
	public void printList(){
	
		theList.sort((a,b)->a.getMarks()>b.getMarks() ?1:-1 );
		for(Student s:theList) {
			System.out.println(s);
		}
	}
	public void printAppName(){
	
		System.out.println(appname);
		
	}

	

}
