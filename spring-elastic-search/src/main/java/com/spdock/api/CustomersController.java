package com.spdock.api;


import com.spdock.dataAccess.CustomerRepository;
import com.spdock.entities.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/customers/")
public final class CustomersController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    public void init(){
        Customer customer = new Customer();
        customer.setCustomerName("Jospeh");
        customer.setCustomerSurname("HenimeX");
        customer.setCustomerAddress("Eskisehir");
        customer.setCustomerBirthdate(Calendar.getInstance().getTime());
        customer.setId("K0001");
        customerRepository.save(customer);
    }

    @GetMapping("{search}")
    public List<Customer> getCustomer(@PathVariable String search){
        return customerRepository.getByCustomQuery(search);
    }

    @GetMapping("2nd/{search}")
    public List<Customer> getCustomerSecond(@PathVariable String search){
        return customerRepository.getByCustomerName(search);
    }


}

