package org.example.entity;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    private int aId;

    private String no;

    @ManyToOne
    private Student student;


    public Address() {}

    public Address(int aId, String no, String address, Student student) {
        this.aId = aId;
        this.no = no;
        this.student = student;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
