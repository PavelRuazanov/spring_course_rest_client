package com.pavelruazanov.spring.rest;

import com.pavelruazanov.spring.rest.configuration.MyConfig;
import com.pavelruazanov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.showAllEmployees();
//        System.out.println(allEmployees);
//
//        Employee empByID = communication.getEmployee(4);
//        System.out.println(empByID);
//
//        Employee employee = new Employee("Sveta", "Sokolova","IT",1200);
//        employee.setId(12);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(12);
    }
}
