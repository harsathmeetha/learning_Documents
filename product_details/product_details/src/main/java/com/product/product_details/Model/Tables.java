/*
 * This file is generated by jOOQ.
 */
package com.product.product_details.Model;


import com.product.product_details.Model.tables.Customers;
import com.product.product_details.Model.tables.Orders;
import com.product.product_details.Model.tables.UserDetails;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.customers</code>.
     */
    public static final Customers CUSTOMERS = Customers.CUSTOMERS;

    /**
     * The table <code>public.orders</code>.
     */
    public static final Orders ORDERS = Orders.ORDERS;

    /**
     * The table <code>public.user_details</code>.
     */
    public static final UserDetails USER_DETAILS = UserDetails.USER_DETAILS;
}
