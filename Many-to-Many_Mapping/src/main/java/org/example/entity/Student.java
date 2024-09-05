package org.example.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    private long id;

    private String name;

    @ManyToMany
    private List<Course> courses;

    public Student() {}

    public Student(long id, String name, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
