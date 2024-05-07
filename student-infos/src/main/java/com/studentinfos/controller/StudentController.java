package com.studentinfos.controller;
import com.studentinfos.entities.Student;
import com.studentinfos.services.StudentService;
import java.util.List;

public class StudentController {
    private StudentService studentService;

    public StudentController() {
        this.studentService = new StudentService();
    }

    public void addStudent(String name, int age ) {
        studentService.addStudent(name, age);
    }

    public Student getStudent(Long id) {
        return studentService.getStudent(id);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public void updateStudent(Long id, String name, int age) {
        studentService.updateStudent(id,name,age);
    }

    public void removeStudent(Long id) {
        studentService.removeStudent(id);
    }
}

