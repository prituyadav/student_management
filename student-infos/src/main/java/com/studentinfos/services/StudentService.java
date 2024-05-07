package com.studentinfos.services;
import com.studentinfos.dao.StudentDao;
import com.studentinfos.entities.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentService {
  private final StudentDao studentDao;

  public StudentService() {
    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    this.studentDao = new StudentDao(sessionFactory);
  }

  public void addStudent(String name, int age) {
    Student student = new Student();
    student.setName(name);
    student.setAge(age);
    studentDao.addStudent(student);
  }

  public void removeStudent(Long id) {
    Student student = studentDao.getStudent(id);
    if (student != null) {
      studentDao.removeStudent(student);
    }
  }

  public void updateStudent(Long id, String name, int age) {
    Student student = studentDao.getStudent(id);
    if (student != null) {
      student.setName(name);
      student.setAge(age);
      studentDao.updateStudent(student);
    }
  }

  public Student getStudent(Long id) {
    return studentDao.getStudent(id);
  }

  public List<Student> getAllStudents() {
    return studentDao.getAllStudents();
  }

}
