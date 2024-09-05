package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Course;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Course course1 = new Course();
        course1.setId(1);
        course1.setCourseName("Mathematics");
        course1.setCourseDuration(6);

        Course course2 = new Course();
        course2.setId(2);
        course2.setCourseName("Computer Science");
        course2.setCourseDuration(12);

        // Create Student objects
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Sampath");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Nadish");

        List<Course> sampath = new ArrayList<>();
        sampath.add(course1);
        sampath.add(course2);
        student1.setCourses(sampath);

        List<Course> nadish = new ArrayList<>();
        nadish.add(course1);
        student2.setCourses(nadish);

        List<Student> course1Students = new ArrayList<>();
        course1Students.add(student1);
        course1Students.add(student2);
        course1.setStudents(course1Students);

        List<Student> course2Students = new ArrayList<>();
        course2Students.add(student1);
        course2.setStudents(course2Students);

        session.persist(course1);
        session.persist(course2);
        session.persist(student1);
        session.persist(student2);

        // Commit the transaction
        transaction.commit();
        session.close();
    }
}
