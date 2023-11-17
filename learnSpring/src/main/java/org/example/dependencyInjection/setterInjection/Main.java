package org.example.dependencyInjection.setterInjection;

import org.example.dependencyInjection.setterInjection.collections.Employee;
import org.example.dependencyInjection.setterInjection.primitive.Student;
import org.example.dependencyInjection.setterInjection.reference.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("Student1");
//        System.out.println(student1);
        ApplicationContext context1= new ClassPathXmlApplicationContext("collectionConfig.xml");
        Employee employee = (Employee) context1.getBean("Employee1");
//        System.out.println(employee);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("referenceConfig.xml");
        A a = (A) context2.getBean("A1");
        System.out.println(a);

    }
}