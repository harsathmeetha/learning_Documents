package com.product.product_details.validator;


import com.product.product_details.Model.tables.pojos.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsFetch {
    @NotNull(message = "customer_id is not null")
    private Integer customer_id;
    @NotEmpty(message = "fist_name is not be empty")
    private String first_name;
    @NotEmpty(message = "last_name is not be empty")
    private String last_name;
    private Long phone_number;
    @NotBlank(message = "location id not be blank")
    private String location;
    private Integer zipcode;

    private List<Orders> orders;

//    public Integer getCustomer_id() {
//        return customer_id;
//    }
//
//    public void setCustomer_id(Integer customer_id) {
//        this.customer_id = customer_id;
//    }
//
//    public String getFirst_name() {
//        return first_name;
//    }
//
//    public void setFirst_name(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
//
//    public Long getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(Long phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public Integer getZipcode() {
//        return zipcode;
//    }
//
//    public void setZipcode(Integer zipcode) {
//        this.zipcode = zipcode;
//    }
//
//    public List<Orders> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<Orders> orders) {
//        this.orders = orders;
//    }
//
//    public UserDetailsFetch() {
//    }
//
//    public UserDetailsFetch(Integer customer_id, String first_name, String last_name, Long phone_number, String location, Integer zipcode, List<Orders> orders) {
//        this.customer_id = customer_id;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.phone_number = phone_number;
//        this.location = location;
//        this.zipcode = zipcode;
//        this.orders = orders;
//    }
}