package com.example.examdart.mapper;

import com.example.examdart.entity.Customer;
import com.example.examdart.model.dto.CustomerDTO;
import com.example.examdart.model.req.CustomerReq;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper extends MapperEntity<CustomerDTO, Customer> {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer mapReqToEntity(CustomerReq req);
}
