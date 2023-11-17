package org.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String Name;
    private String age;
    @Autowired
    private Address address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, String age, Address address) {
        super();
        Name = name;
        this.age = age;
        this.address = address;
    }

    public Student(){
        super();
    }
}
