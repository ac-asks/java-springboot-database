package com.aprilchi.Service;

import com.aprilchi.Dao.FakeStudentDaoImplementation;
import com.aprilchi.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakeData")
    // access dao
    private FakeStudentDaoImplementation fakeStudentDaoImplementation;

    // method to get data - gets collection from the hash map and gives it to us
    public Collection<Student> getAllStudents(){
        return this.fakeStudentDaoImplementation.getAllStudents();
    }

    // can add functionality to check if student exists
    public Student getStudentById(int id) {
        return this.fakeStudentDaoImplementation.getStudentById(id);
    }

    // can also check if student exists
    public void removeStudentById(int id) {
        this.fakeStudentDaoImplementation.removeStudentById(id);
    }

    public void updateStudent(Student student){

        this.fakeStudentDaoImplementation.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.fakeStudentDaoImplementation.insertStudentToDb(student);
    }
}
