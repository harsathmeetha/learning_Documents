/*
 * This file is generated by jOOQ.
 */
package com.product.product_details.Model.tables.records;


import com.product.product_details.Model.tables.UserDetails;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class UserDetailsRecord extends TableRecordImpl<UserDetailsRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -427437936;

    /**
     * Setter for <code>public.user_details.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_details.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.user_details.cus_id</code>.
     */
    public void setCusId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_details.cus_id</code>.
     */
    public Integer getCusId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.user_details.ord_id</code>.
     */
    public void setOrdId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user_details.ord_id</code>.
     */
    public Integer getOrdId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserDetails.USER_DETAILS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return UserDetails.USER_DETAILS.CUS_ID;
    }

    @Override
    public Field<Integer> field3() {
        return UserDetails.USER_DETAILS.ORD_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getCusId();
    }

    @Override
    public Integer component3() {
        return getOrdId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getCusId();
    }

    @Override
    public Integer value3() {
        return getOrdId();
    }

    @Override
    public UserDetailsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserDetailsRecord value2(Integer value) {
        setCusId(value);
        return this;
    }

    @Override
    public UserDetailsRecord value3(Integer value) {
        setOrdId(value);
        return this;
    }

    @Override
    public UserDetailsRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserDetailsRecord
     */
    public UserDetailsRecord() {
        super(UserDetails.USER_DETAILS);
    }

    /**
     * Create a detached, initialised UserDetailsRecord
     */
    public UserDetailsRecord(Integer id, Integer cusId, Integer ordId) {
        super(UserDetails.USER_DETAILS);

        set(0, id);
        set(1, cusId);
        set(2, ordId);
    }
}
