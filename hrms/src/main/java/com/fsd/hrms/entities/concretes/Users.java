package com.fsd.hrms.entities.concretes;


import lombok.Data;

public @Data

class Users {
    int id ;
    private String email;
    private String password;
    private String rePassword;
}

