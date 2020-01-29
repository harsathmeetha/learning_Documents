package com.customer.customerApplication.validator;

import com.customer.customerApplication.Model.tables.pojos.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userDetailsFetch {
    private Integer customerId;
    @NotBlank
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String location;
    private Integer zipcode;

    private List<Orders> orders;
}
