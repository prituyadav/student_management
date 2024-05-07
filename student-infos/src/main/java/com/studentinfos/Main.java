package com.studentinfos;

import com.studentinfos.controller.StudentController;
import com.studentinfos.entities.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        sessionFactory.openSession();
        sessionFactory.close();

        StudentController studentController = new StudentController();

        studentController.addStudent("King", 10);

        studentController.removeStudent((long)2);

       Student student= studentController.getStudent((long)1);
        System.out.println(student);


       List<Student> students= studentController.getAllStudents();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("task completed");

    }
}
