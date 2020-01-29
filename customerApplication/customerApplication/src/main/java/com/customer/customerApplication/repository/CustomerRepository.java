package com.customer.customerApplication.repository;

import com.customer.customerApplication.Model.tables.pojos.UserDetails;
import com.customer.customerApplication.Model.tables.pojos.Customers;
import com.customer.customerApplication.Model.tables.pojos.Orders;
import com.customer.customerApplication.validator.userDetailsFetch;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.customer.customerApplication.Model.tables.Customers.CUSTOMERS;
import static com.customer.customerApplication.Model.tables.Orders.ORDERS;
import static com.customer.customerApplication.Model.tables.UserDetails.USER_DETAILS;

@Repository
public class CustomerRepository {
    private DSLContext db;

    public CustomerRepository(DSLContext db) {
        this.db = db;
    }
    public List<Customers> getCustomer() {
        return db.selectFrom(CUSTOMERS)
                .fetchInto(Customers.class);
    }
    public UserDetails getDetails(Integer id) {
        return db.select()
                .from(CUSTOMERS)
                .join(USER_DETAILS)
                .on(USER_DETAILS.CUS_ID.eq(CUSTOMERS.CUSTOMERID))
                .join(ORDERS).on(ORDERS.ORDERID.eq(USER_DETAILS.ORD_ID))
                .where(USER_DETAILS.CUS_ID.eq(id))
                .fetchOneInto(UserDetails.class);
    }
    public userDetailsFetch getUserDetails(Integer id) {
        Customers customers = db.selectFrom(CUSTOMERS).where(CUSTOMERS.CUSTOMERID.eq(id))
                .fetchOneInto(Customers.class);
        System.out.println("customer" + customers + "cus");
        List<Orders> orders = db.select(ORDERS.ORDERID, ORDERS.ORDERSTATUS, ORDERS.PRODUCTS)
                .from(ORDERS)
                .join(USER_DETAILS)
                .on(USER_DETAILS.CUS_ID.eq(id))
                .where(ORDERS.ORDERID.eq(USER_DETAILS.ORD_ID))
                .fetchInto(Orders.class);
        return new userDetailsFetch(customers.getCustomerid(), customers.getFirstname(), customers.getLastname(),
                customers.getPhonenumber(), customers.getLocation(), customers.getZipcode(), orders);
    }

    public void addRecords(Orders orders, Integer id){
        db.insertInto(ORDERS, ORDERS.ORDERSTATUS, ORDERS.PRODUCTS)
                .values(orders.getOrderstatus(),orders.getProducts())
                .execute();
        db.insertInto(USER_DETAILS, USER_DETAILS.CUS_ID, USER_DETAILS.ORD_ID)
                .values(id, orders.getOrderid())
                .execute();
    }
    public void updateRecords(Orders orders, Integer id) {
        db.update(ORDERS)
                .set(ORDERS.ORDERSTATUS, orders.getOrderstatus())
                .set(ORDERS.PRODUCTS, orders.getProducts())
                .where(ORDERS.ORDERID.eq(id))
                .execute();
    }
    public void deleteRecords(Orders orders, Integer id) {
        db.delete(USER_DETAILS)
                .where(USER_DETAILS.ORD_ID.eq(id))
                .execute();
        db.delete(ORDERS)
                .where(ORDERS.ORDERID.eq(id))
                .execute();
    }
}
