/*
 * This file is generated by jOOQ.
 */
package com.customer.customerApplication.Model.tables.daos;


import com.customer.customerApplication.Model.tables.Customers;
import com.customer.customerApplication.Model.tables.records.CustomersRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class CustomersDao extends DAOImpl<CustomersRecord, com.customer.customerApplication.Model.tables.pojos.Customers, Integer> {

    /**
     * Create a new CustomersDao without any configuration
     */
    public CustomersDao() {
        super(Customers.CUSTOMERS, com.customer.customerApplication.Model.tables.pojos.Customers.class);
    }

    /**
     * Create a new CustomersDao with an attached configuration
     */
    public CustomersDao(Configuration configuration) {
        super(Customers.CUSTOMERS, com.customer.customerApplication.Model.tables.pojos.Customers.class, configuration);
    }

    @Override
    public Integer getId(com.customer.customerApplication.Model.tables.pojos.Customers object) {
        return object.getCustomerid();
    }

    /**
     * Fetch records that have <code>customerId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchRangeOfCustomerid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Customers.CUSTOMERS.CUSTOMERID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customerId IN (values)</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchByCustomerid(Integer... values) {
        return fetch(Customers.CUSTOMERS.CUSTOMERID, values);
    }

    /**
     * Fetch a unique record that has <code>customerId = value</code>
     */
    public com.customer.customerApplication.Model.tables.pojos.Customers fetchOneByCustomerid(Integer value) {
        return fetchOne(Customers.CUSTOMERS.CUSTOMERID, value);
    }

    /**
     * Fetch records that have <code>firstName BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchRangeOfFirstname(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customers.CUSTOMERS.FIRSTNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>firstName IN (values)</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchByFirstname(String... values) {
        return fetch(Customers.CUSTOMERS.FIRSTNAME, values);
    }

    /**
     * Fetch records that have <code>lastName BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchRangeOfLastname(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customers.CUSTOMERS.LASTNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>lastName IN (values)</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchByLastname(String... values) {
        return fetch(Customers.CUSTOMERS.LASTNAME, values);
    }

    /**
     * Fetch records that have <code>phoneNumber BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchRangeOfPhonenumber(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Customers.CUSTOMERS.PHONENUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phoneNumber IN (values)</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchByPhonenumber(Long... values) {
        return fetch(Customers.CUSTOMERS.PHONENUMBER, values);
    }

    /**
     * Fetch records that have <code>location BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchRangeOfLocation(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customers.CUSTOMERS.LOCATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>location IN (values)</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchByLocation(String... values) {
        return fetch(Customers.CUSTOMERS.LOCATION, values);
    }

    /**
     * Fetch records that have <code>zipcode BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchRangeOfZipcode(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Customers.CUSTOMERS.ZIPCODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>zipcode IN (values)</code>
     */
    public List<com.customer.customerApplication.Model.tables.pojos.Customers> fetchByZipcode(Integer... values) {
        return fetch(Customers.CUSTOMERS.ZIPCODE, values);
    }
}
