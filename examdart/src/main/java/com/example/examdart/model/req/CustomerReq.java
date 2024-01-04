package com.example.examdart.model.req;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerReq {

    private Long id;

    private String fullName;

    private Date birthday;

    private String address;

    private String phoneNumber;

    private int pageNumber = 0;

    private int pageSize = 20;
}
