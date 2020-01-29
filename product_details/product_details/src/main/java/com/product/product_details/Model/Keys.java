/*
 * This file is generated by jOOQ.
 */
package com.product.product_details.Model;


import com.product.product_details.Model.tables.Customers;
import com.product.product_details.Model.tables.Orders;
import com.product.product_details.Model.tables.UserDetails;
import com.product.product_details.Model.tables.records.CustomersRecord;
import com.product.product_details.Model.tables.records.OrdersRecord;
import com.product.product_details.Model.tables.records.UserDetailsRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CustomersRecord, Integer> IDENTITY_CUSTOMERS = Identities0.IDENTITY_CUSTOMERS;
    public static final Identity<OrdersRecord, Integer> IDENTITY_ORDERS = Identities0.IDENTITY_ORDERS;
    public static final Identity<UserDetailsRecord, Integer> IDENTITY_USER_DETAILS = Identities0.IDENTITY_USER_DETAILS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CustomersRecord> CUSTOMERS_PKEY = UniqueKeys0.CUSTOMERS_PKEY;
    public static final UniqueKey<OrdersRecord> ORDERS_PKEY = UniqueKeys0.ORDERS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<UserDetailsRecord, CustomersRecord> USER_DETAILS__USER_DETAILS_CUS_ID_FKEY = ForeignKeys0.USER_DETAILS__USER_DETAILS_CUS_ID_FKEY;
    public static final ForeignKey<UserDetailsRecord, OrdersRecord> USER_DETAILS__USER_DETAILS_ORD_ID_FKEY = ForeignKeys0.USER_DETAILS__USER_DETAILS_ORD_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CustomersRecord, Integer> IDENTITY_CUSTOMERS = Internal.createIdentity(Customers.CUSTOMERS, Customers.CUSTOMERS.CUSTOMER_ID);
        public static Identity<OrdersRecord, Integer> IDENTITY_ORDERS = Internal.createIdentity(Orders.ORDERS, Orders.ORDERS.ORDER_ID);
        public static Identity<UserDetailsRecord, Integer> IDENTITY_USER_DETAILS = Internal.createIdentity(UserDetails.USER_DETAILS, UserDetails.USER_DETAILS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CustomersRecord> CUSTOMERS_PKEY = Internal.createUniqueKey(Customers.CUSTOMERS, "customers_pkey", Customers.CUSTOMERS.CUSTOMER_ID);
        public static final UniqueKey<OrdersRecord> ORDERS_PKEY = Internal.createUniqueKey(Orders.ORDERS, "orders_pkey", Orders.ORDERS.ORDER_ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<UserDetailsRecord, CustomersRecord> USER_DETAILS__USER_DETAILS_CUS_ID_FKEY = Internal.createForeignKey(com.product.product_details.Model.Keys.CUSTOMERS_PKEY, UserDetails.USER_DETAILS, "user_details__user_details_cus_id_fkey", UserDetails.USER_DETAILS.CUS_ID);
        public static final ForeignKey<UserDetailsRecord, OrdersRecord> USER_DETAILS__USER_DETAILS_ORD_ID_FKEY = Internal.createForeignKey(com.product.product_details.Model.Keys.ORDERS_PKEY, UserDetails.USER_DETAILS, "user_details__user_details_ord_id_fkey", UserDetails.USER_DETAILS.ORD_ID);
    }
}