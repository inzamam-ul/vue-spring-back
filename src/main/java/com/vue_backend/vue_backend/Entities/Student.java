package com.vue_backend.vue_backend.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_DB")
public class Student {
    @Id
    @Column(name = "stu_id", unique = true, nullable = false)
    private int id;
    private String name;
    private String dept;
    private String year;
    private String address;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book [address=" + address + ", dept=" + dept + ", id=" + id + ", name=" + name + ", year=" + year + "]";
    }

    public Student(int id, String name, String dept, String year, String address) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.year = year;
        this.address = address;
    }

}
