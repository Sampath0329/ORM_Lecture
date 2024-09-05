package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int aId;

    private String no;
    private String address;

    @OneToOne
    private Student student;

    public Address() {}

    public Address(int aId, String no, String address, Student student) {
        this.aId = aId;
        this.no = no;
        this.address = address;
        this.student = student;
    }

    public Address(int aId, String no, String address) {
        this.aId = aId;
        this.no = no;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
