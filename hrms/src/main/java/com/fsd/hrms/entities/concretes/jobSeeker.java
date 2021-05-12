package com.fsd.hrms.entities.concretes;

import lombok.Data;

import java.util.Date;
@Data
public class jobSeeker {
    private String name;
    private String lastName;
    private String nationalityNumber;
    private Date dateOfBirth;

}
