package com.example.examdart.service;

import com.example.examdart.entity.Customer;
import com.example.examdart.model.dto.CustomerDTO;
import com.example.examdart.model.req.CustomerReq;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface CustomerService {

    Customer save(CustomerReq customer);
    List<Customer> getAll();
    Page<Customer> getCustomers(Pageable pageable, String fullName, Date birthday, String address, String phoneNumber);
}
