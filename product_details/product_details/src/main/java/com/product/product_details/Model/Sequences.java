/*
 * This file is generated by jOOQ.
 */
package com.product.product_details.Model;


import javax.annotation.processing.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.customers_customer_id_seq</code>
     */
    public static final Sequence<Integer> CUSTOMERS_CUSTOMER_ID_SEQ = new SequenceImpl<Integer>("customers_customer_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.orders_order_id_seq</code>
     */
    public static final Sequence<Integer> ORDERS_ORDER_ID_SEQ = new SequenceImpl<Integer>("orders_order_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.user_details_id_seq</code>
     */
    public static final Sequence<Integer> USER_DETAILS_ID_SEQ = new SequenceImpl<Integer>("user_details_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}