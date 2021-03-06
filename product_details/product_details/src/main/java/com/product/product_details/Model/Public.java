/*
 * This file is generated by jOOQ.
 */
package com.product.product_details.Model;


import com.product.product_details.Model.tables.Customers;
import com.product.product_details.Model.tables.Orders;
import com.product.product_details.Model.tables.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -220911495;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.customers</code>.
     */
    public final Customers CUSTOMERS = com.product.product_details.Model.tables.Customers.CUSTOMERS;

    /**
     * The table <code>public.orders</code>.
     */
    public final Orders ORDERS = com.product.product_details.Model.tables.Orders.ORDERS;

    /**
     * The table <code>public.user_details</code>.
     */
    public final UserDetails USER_DETAILS = com.product.product_details.Model.tables.UserDetails.USER_DETAILS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CUSTOMERS_CUSTOMER_ID_SEQ,
            Sequences.ORDERS_ORDER_ID_SEQ,
            Sequences.USER_DETAILS_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Customers.CUSTOMERS,
            Orders.ORDERS,
            UserDetails.USER_DETAILS);
    }
}
