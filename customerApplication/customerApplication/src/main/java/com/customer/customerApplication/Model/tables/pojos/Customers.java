/*
 * This file is generated by jOOQ.
 */
package com.customer.customerApplication.Model.tables.pojos;


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
public class Customers implements Serializable {

    private static final long serialVersionUID = 1029904100;

    private Integer customerid;
    private String  firstname;
    private String  lastname;
    private Long    phonenumber;
    private String  location;
    private Integer zipcode;

    public Customers() {}

    public Customers(Customers value) {
        this.customerid = value.customerid;
        this.firstname = value.firstname;
        this.lastname = value.lastname;
        this.phonenumber = value.phonenumber;
        this.location = value.location;
        this.zipcode = value.zipcode;
    }

    public Customers(
        Integer customerid,
        String  firstname,
        String  lastname,
        Long    phonenumber,
        String  location,
        Integer zipcode
    ) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.location = location;
        this.zipcode = zipcode;
    }

    public Integer getCustomerid() {
        return this.customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Customers (");

        sb.append(customerid);
        sb.append(", ").append(firstname);
        sb.append(", ").append(lastname);
        sb.append(", ").append(phonenumber);
        sb.append(", ").append(location);
        sb.append(", ").append(zipcode);

        sb.append(")");
        return sb.toString();
    }
}
