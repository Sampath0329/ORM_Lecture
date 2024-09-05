package org.example.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    private long id;

    private String courseName;

    private int courseDuration;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Course() {}

    public Course(long id, String courseName, int courseDuration, List<Student> students) {
        this.id = id;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
