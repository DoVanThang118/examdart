package com.example.examdart.controller;


import com.example.examdart.entity.Customer;
import com.example.examdart.model.req.CustomerReq;
import com.example.examdart.model.res.CustomerRes;
import com.example.examdart.model.res.Pagination;
import com.example.examdart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/find")
    public ResponseEntity<CustomerRes> getListReviews(@RequestBody CustomerReq request) {
        Pageable pageable = PageRequest.of(request.getPageNumber(), request.getPageSize());
        Page<Customer> page = customerService.getCustomers(
                pageable,
                request.getFullName(),
                request.getBirthday(),
                request.getAddress(),
                request.getPhoneNumber());
        CustomerRes response = new CustomerRes();
        response.setData(page.getContent());
        response.setPagination(new Pagination(page.getPageable().getPageNumber(), page.getSize(), page.getTotalElements()));
        return ResponseEntity.ok(response);
    }

    @GetMapping("get")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(customerService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addCustomer(@RequestBody CustomerReq req) {
        Customer customer = customerService.save(req);
        return ResponseEntity.ok(customer);
    }

}
