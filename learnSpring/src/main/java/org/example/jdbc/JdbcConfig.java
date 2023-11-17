package org.example.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("package org.example.jdbc")
public class JdbcConfig {
    @Bean("ds")
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/jdbc_students");
        ds.setUsername("root");
        ds.setPassword("HelloWorld123");
        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean(name = {"studentDao"})  //or @Bean("studentDao")
//    public StudentDao getStudentDao(){
//        StudentDaoImpl s = new StudentDaoImpl();
//        s.setJdbcTemplate(getTemplate());
//        return s;
//    }
}
