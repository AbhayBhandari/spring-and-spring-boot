package org.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void create(Student student, Address address) {
        String query = "INSERT INTO STUDENTS_DATA (name, age, city, state, pincode) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(query, student.getName(),student.getAge(), address.getCity(), address.getState(),address.getPincode());
    }

    public void read() {

    }

    public void update(Student student) {

    }

    public void delete(Student student) {

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}
