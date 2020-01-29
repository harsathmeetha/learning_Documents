/*
 * This file is generated by jOOQ.
 */
package com.product.product_details.Model.tables.daos;


import com.product.product_details.Model.tables.Orders;
import com.product.product_details.Model.tables.records.OrdersRecord;

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
public class OrdersDao extends DAOImpl<OrdersRecord, com.product.product_details.Model.tables.pojos.Orders, Integer> {

    /**
     * Create a new OrdersDao without any configuration
     */
    public OrdersDao() {
        super(Orders.ORDERS, com.product.product_details.Model.tables.pojos.Orders.class);
    }

    /**
     * Create a new OrdersDao with an attached configuration
     */
    public OrdersDao(Configuration configuration) {
        super(Orders.ORDERS, com.product.product_details.Model.tables.pojos.Orders.class, configuration);
    }

    @Override
    public Integer getId(com.product.product_details.Model.tables.pojos.Orders object) {
        return object.getOrderId();
    }

    /**
     * Fetch records that have <code>order_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.product.product_details.Model.tables.pojos.Orders> fetchRangeOfOrderId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Orders.ORDERS.ORDER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<com.product.product_details.Model.tables.pojos.Orders> fetchByOrderId(Integer... values) {
        return fetch(Orders.ORDERS.ORDER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>order_id = value</code>
     */
    public com.product.product_details.Model.tables.pojos.Orders fetchOneByOrderId(Integer value) {
        return fetchOne(Orders.ORDERS.ORDER_ID, value);
    }

    /**
     * Fetch records that have <code>order_status BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.product.product_details.Model.tables.pojos.Orders> fetchRangeOfOrderStatus(String lowerInclusive, String upperInclusive) {
        return fetchRange(Orders.ORDERS.ORDER_STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order_status IN (values)</code>
     */
    public List<com.product.product_details.Model.tables.pojos.Orders> fetchByOrderStatus(String... values) {
        return fetch(Orders.ORDERS.ORDER_STATUS, values);
    }

    /**
     * Fetch records that have <code>products BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.product.product_details.Model.tables.pojos.Orders> fetchRangeOfProducts(String lowerInclusive, String upperInclusive) {
        return fetchRange(Orders.ORDERS.PRODUCTS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>products IN (values)</code>
     */
    public List<com.product.product_details.Model.tables.pojos.Orders> fetchByProducts(String... values) {
        return fetch(Orders.ORDERS.PRODUCTS, values);
    }
}