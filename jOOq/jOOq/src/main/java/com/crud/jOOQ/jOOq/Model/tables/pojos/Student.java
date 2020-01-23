/*
 * This file is generated by jOOQ.
 */
package com.crud.jOOQ.jOOq.Model.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student implements Serializable {

    private static final long serialVersionUID = -368008345;

    private Integer id;
    private String  name;
    private String  dod;
    private String  department;
    private String  collegeName;
    private String  place;

    public Student() {}

    public Student(Student value) {
        this.id = value.id;
        this.name = value.name;
        this.dod = value.dod;
        this.department = value.department;
        this.collegeName = value.collegeName;
        this.place = value.place;
    }

    public Student(
        Integer id,
        String  name,
        String  dod,
        String  department,
        String  collegeName,
        String  place
    ) {
        this.id = id;
        this.name = name;
        this.dod = dod;
        this.department = department;
        this.collegeName = collegeName;
        this.place = place;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDod() {
        return this.dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeName() {
        return this.collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(dod);
        sb.append(", ").append(department);
        sb.append(", ").append(collegeName);
        sb.append(", ").append(place);

        sb.append(")");
        return sb.toString();
    }
}
