package com.customer.customerApplication.controller;

import com.customer.customerApplication.Model.tables.pojos.Customers;
import com.customer.customerApplication.Model.tables.pojos.Orders;
import com.customer.customerApplication.Model.tables.pojos.UserDetails;
import com.customer.customerApplication.repository.CustomerRepository;
import com.customer.customerApplication.validator.userDetailsFetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository repository) {
        this.customerRepository = repository;
    }
    @GetMapping("/customer")
    public List<Customers> getCustomer(){
        return customerRepository.getCustomer();
    }

    @GetMapping("/customer/{id}")
    public UserDetails details(@PathVariable Integer id) {
        return customerRepository.getDetails(id);
    }
    @GetMapping("/custom/{id}")
    public userDetailsFetch userDetailsFetch(@PathVariable Integer id){
        return customerRepository.getUserDetails(id);
    }
    @PostMapping("/add/{id}")
    public void addRecords(@PathVariable Integer id, @RequestBody Orders orders){
        customerRepository.addRecords(orders,id);
    }
    @PutMapping("/update/{id}")
    public void updateRecords(@PathVariable Integer id, @RequestBody Orders orders){
        customerRepository.updateRecords(orders,id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteRecords(@PathVariable Integer id, @RequestBody Orders orders){
        customerRepository.deleteRecords(orders,id);
    }
}
