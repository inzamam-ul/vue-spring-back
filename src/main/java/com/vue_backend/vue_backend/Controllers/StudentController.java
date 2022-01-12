package com.vue_backend.vue_backend.Controllers;

import java.util.List;

import com.vue_backend.vue_backend.Entities.Student;
import com.vue_backend.vue_backend.Services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String hello() {
        return "iam still alive";
    }

    @GetMapping("/allStudents")
    public List<Student> getStudents() {
        return this.studentService.getAllStudent();
    }

    @GetMapping("/singleStudent/{id}")
    public Student singleStudent(@PathVariable("id") int id) {

        return studentService.getSingleStudent(id);

    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student stu) {
        Student student = null;

        try {
            student = this.studentService.addStudent(stu);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/DeleteStudent/{id}")
    public List<Student> DeleteBook(@PathVariable("id") int id) {

        return this.studentService.deleteBook(id);

    }

    @PostMapping("/updateStudent/{id}")
    public List<Student> updateStudent(@RequestBody Student stu, @PathVariable("id") int id) {
        System.out.println(id);

        return this.studentService.updateStudent(stu, id);

    }

}
