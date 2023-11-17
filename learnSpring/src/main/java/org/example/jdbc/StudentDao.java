package org.example.jdbc;

public interface StudentDao {
    public void create(Student student, Address address);
    public void read();
    public void update(Student student);
    public void delete(Student student);
}
