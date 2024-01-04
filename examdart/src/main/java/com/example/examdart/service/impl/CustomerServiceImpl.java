package com.example.examdart.service.impl;

import com.example.examdart.entity.Customer;
import com.example.examdart.mapper.CustomerMapper;
import com.example.examdart.model.req.CustomerReq;
import com.example.examdart.repository.CustomerRepository;
import com.example.examdart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer save(CustomerReq req) {
        Customer customer = CustomerMapper.INSTANCE.mapReqToEntity(req);
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> getCustomers(Pageable pageable, String fullName, Date birthday, String address, String phoneNumber) {
        return customerRepository.findCustomers( pageable,  fullName,  birthday,  address,  phoneNumber);
    }
}
