package com.aprilchi.Dao;

import com.aprilchi.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    // method to get data - gets collection from the hash map and gives it to us
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
