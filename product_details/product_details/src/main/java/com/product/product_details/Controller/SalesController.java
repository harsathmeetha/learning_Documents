package com.product.product_details.Controller;


import com.product.product_details.Model.tables.pojos.Customers;
import com.product.product_details.Model.tables.pojos.Orders;
import com.product.product_details.Model.tables.pojos.UserDetails;
import com.product.product_details.Repository.SalesRepository;
import com.product.product_details.validator.UserDetailsFetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    private SalesRepository salesRepository;

    public SalesController(SalesRepository repository) {
        this.salesRepository = repository;
    }

    @GetMapping("/sales/{id}")
    public UserDetails sales(@PathVariable Integer id) {
        System.out.println("AA" + salesRepository.get(id) + "BB");
        return salesRepository.get(id);
    }
        @GetMapping("/customer/{id}")
        public UserDetailsFetch userDetailsFetch(@PathVariable Integer id){
            return salesRepository.getUserDetails(id);
        }
    @GetMapping("/order/{id}")
    public Orders orders(@PathVariable Integer id){
        System.out.println("AA" + salesRepository.getOrder(id) + "BB");
        return salesRepository.getOrder(id);
    }
    @PostMapping("/add/{id}")
    public void addRecords(@RequestBody Orders orders, @PathVariable Integer id){
//        salesRepository.addRecords(customers);
        salesRepository.addRecords(orders,id);
      //  salesRepository.addRecords(userDetails);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteRecords(@RequestBody Orders orders, @PathVariable Integer id){
        salesRepository.deleteRecords(orders,id);
    }
    @PutMapping("/update/{id}")
    public void updateRecords(@RequestBody Orders orders, @PathVariable Integer id){
        salesRepository.updateRecords(orders,id);
    }
    @PostMapping("/customer/{id}")
    public String insertInto(@RequestBody Customers customers,@PathVariable Integer id){
        salesRepository.insert(customers,id);
        return "Customers updated sucessfully";
    }
    @GetMapping("examples")
    public List<Customers> getDetails(){
        return salesRepository.getDetails();
    }
}
