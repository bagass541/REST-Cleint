package com.bagas.spring.rest.spring_course_rest_client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bagas.spring.rest.spring_course_rest_client.Configuration.MyConfig;
import com.bagas.spring.rest.spring_course_rest_client.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(MyConfig.class);
        
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
        
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);
        
//        Employee employee = new Employee("Sveta", "Sokolova",
//        		"IT", 1100);
//        employee.setId(11);
//        communication.saveEmployee(employee);
        
        communication.deleteEmployee(11);
    }
}
