package com.example.examdart.repository;

import com.example.examdart.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value = "select c from Customer c " +
            "where (coalesce(:fullName, null) is null or c.fullName like %:fullName%)" +
            "and (coalesce(:birthday, null) is null or c.birthday in (:birthday))" +
            "and (coalesce(:address, null) is null or c.address like %:address%)" +
            "and (coalesce(:phoneNumber, null) is null or c.phoneNumber like %:phoneNumber%)"
    )
    Page<Customer> findCustomers(Pageable pageable, String fullName, Date birthday, String address, String phoneNumber);
}
