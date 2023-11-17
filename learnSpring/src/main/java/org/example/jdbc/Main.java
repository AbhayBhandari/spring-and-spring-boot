package org.example.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        StudentDao s = context.getBean("studentDao", StudentDao.class);

        Address address = new Address();
        address.setCity("Jammu");
        address.setState("JK");
        address.setPincode("123456");

        Student student = new Student();
        student.setName("Rama");
        student.setAge("22");
        student.setAddress(address);

        s.create(student, address);

    }
}
