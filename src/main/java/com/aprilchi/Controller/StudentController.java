package com.aprilchi.Controller;

import com.aprilchi.Entity.Student;
import com.aprilchi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    // need access to Dao
    private StudentService studentService;

    @RequestMapping(method= RequestMethod.GET)
    // method to get data - gets collection from the hash map and gives it to us
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // get student via ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // gather ID from URL using path variable
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    // method to delete student by id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.removeStudentById(id);
    }

    // handle put
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    // pass the actual student
    public void deleteStudentById(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    // insert the student
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    // pass the actual student
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }




}
