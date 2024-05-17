package com.example.jpa.Controller;

import com.example.jpa.model.Customer;
import com.example.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/jpa")

public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/add")
    public ResponseEntity<Object> addNewCustomer(@RequestParam String name, @RequestParam String email, @RequestParam String phone){
        Customer customer=new Customer(name, email, phone);
        customerRepository.save(customer);
        return new ResponseEntity<>("Information save.", HttpStatus.CREATED);
    }
}
