package com.crud.jOOQ.jOOq.StudentController;

import com.crud.jOOQ.jOOq.Model.tables.pojos.Student;
import com.crud.jOOQ.jOOq.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    private Student student;

    public StudentController(StudentRepository repository) {
        this.studentRepository = repository;
    }
    @GetMapping("/student")
    public List<Student> getDetails() {
        return studentRepository.getDetails();
    }
    @GetMapping("/student/{id}")
    public Student getById(@PathVariable int id, @RequestBody Student student){
        return studentRepository.getById(id);
    }

    @PostMapping("/student")
    public void student(@RequestBody Student student) {
        studentRepository.update(student);
    }

    @PutMapping("/student/{id}")
    public void setStudent(@RequestBody Student student, @PathVariable int id) {
        studentRepository.setStudent(student, id);
    }
    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable int id, @RequestBody Student student){
        studentRepository.delete(student, id);
    }
}
