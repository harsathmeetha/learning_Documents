package com.product.product_details.Repository;


import com.product.product_details.Model.tables.pojos.Customers;
import com.product.product_details.Model.tables.pojos.Orders;
import com.product.product_details.Model.tables.pojos.UserDetails;
import com.product.product_details.validator.UserDetailsFetch;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.product.product_details.Model.tables.Customers.CUSTOMERS;
import static com.product.product_details.Model.tables.Orders.ORDERS;
import static com.product.product_details.Model.tables.UserDetails.USER_DETAILS;

@Repository
public class SalesRepository {
    private DSLContext db;

    public SalesRepository(DSLContext db) {
        this.db = db;
    }

    public UserDetails get(Integer id) {
        return db.select()
                .from(CUSTOMERS)
                .join(USER_DETAILS)
                .on(USER_DETAILS.CUS_ID.eq(CUSTOMERS.CUSTOMER_ID))
                .join(ORDERS).on(ORDERS.ORDER_ID.eq(USER_DETAILS.ORD_ID))
                .where(USER_DETAILS.CUS_ID.eq(id))
                .fetchOneInto(UserDetails.class);
    }

    public List<Customers> getDetails() {
        return db.selectFrom(CUSTOMERS)
                .fetchInto(Customers.class);
    }

    public UserDetailsFetch getUserDetails(Integer id) {
        Customers customers = db.selectFrom(CUSTOMERS).where(CUSTOMERS.CUSTOMER_ID.eq(id))
                .fetchOneInto(Customers.class);
        System.out.println("customer" + customers + "cus");
        List<Orders> orders = db.select(ORDERS.ORDER_ID, ORDERS.ORDER_STATUS, ORDERS.PRODUCTS)
                .from(ORDERS)
                .join(USER_DETAILS)
                .on(USER_DETAILS.CUS_ID.eq(id))
                .where(ORDERS.ORDER_ID.eq(USER_DETAILS.ORD_ID))
                .fetchInto(Orders.class);
        return new UserDetailsFetch(customers.ge    tCustomerId(), customers.getFirstName(), customers.getLastName(),
                customers.getPhoneNumber(), customers.getLocation(), customers.getZipcode(), orders);
    }

    public void addRecords(Orders orders, Integer id) {

        db.insertInto(ORDERS, ORDERS.ORDER_STATUS, ORDERS.PRODUCTS)
                .values(orders.getOrderStatus(), orders.getProducts())
                .execute();
        db.insertInto(USER_DETAILS, USER_DETAILS.CUS_ID, USER_DETAILS.ORD_ID)
                .values(id, orders.getOrderId()).execute();
    }

    public void updateRecords(Orders orders, Integer id) {
        db.update(ORDERS)
                .set(ORDERS.ORDER_STATUS, orders.getOrderStatus())
                .set(ORDERS.PRODUCTS, orders.getProducts())
                .where(ORDERS.ORDER_ID.eq(id))
                .execute();
    }

    public void deleteRecords(Orders orders, Integer id) {
        db.delete(USER_DETAILS)
                .where(USER_DETAILS.ORD_ID.eq(id))
                .execute();
        db.delete(ORDERS)
                .where(ORDERS.ORDER_ID.eq(id))
                .execute();
    }


    public Orders getOrder(Integer id) {
        return db.select()
                .from(USER_DETAILS)
                .join(ORDERS)
                .on(ORDERS.ORDER_ID.eq(USER_DETAILS.ORD_ID))
                .where(ORDERS.ORDER_ID.eq(id))
                .fetchOneInto(Orders.class);
    }

    @Transactional
    public void insert(Customers customers, Integer id) {
        db.insertInto(CUSTOMERS, CUSTOMERS.FIRST_NAME, CUSTOMERS.LAST_NAME,
                CUSTOMERS.PHONE_NUMBER, CUSTOMERS.LOCATION, CUSTOMERS.ZIPCODE)
                .values(customers.getFirstName(), customers.getLastName(), customers.getPhoneNumber(),
                        customers.getLocation(), customers.getZipcode())
                .execute();
        db.insertInto(USER_DETAILS, USER_DETAILS.CUS_ID, USER_DETAILS.ORD_ID)
                .values(id, customers.getCustomerId())
                .execute();
    }
}
//    public UserDetailsFetch addDetails(Integer id){
//        UserDetails userDetails=db.selectFrom(USER_DETAILS).where(USER_DETAILS.CUS_ID.eq(id))
//                .fetchOneInto(UserDetails.class);
//       db.insertInto(ORDERS, ORDERS.ORDER_ID,ORDERS.ORDER_STATUS,ORDERS.PRODUCTS)
//                .values(g)
//        .execute();
//    }

//    public void addRecords(Customers customers) {
//        db.insertInto(CUSTOMERS, CUSTOMERS.CUSTOMER_ID, CUSTOMERS.FIRST_NAME, CUSTOMERS.LAST_NAME, CUSTOMERS.PHONE_NUMBER,
//                CUSTOMERS.LOCATION, CUSTOMERS.ZIPCODE)
//                .values(customers.getCustomerId(),customers.getFirstName(),customers.getLastName(),
//                        customers.getPhoneNumber(),customers.getLocation(),customers.getZipcode())
//                .execute();
//    }
//    public void addRecords(UserDetails userDetails){
//        db.insertInto(USER_DETAILS, USER_DETAILS.ID,USER_DETAILS.CUS_ID,USER_DETAILS.ORD_ID)
//                .values(userDetails.getId(),userDetails.getCusId(),userDetails.getOrdId())
//                .execute();
//    }
// db.update(USER_DETAILS)
//                .set(USER_DETAILS.ORD_ID, orders.getOrderId())
//                .where(USER_DETAILS.ORD_ID.eq(id))
//                .execute();