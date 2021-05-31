package com.fsd.hrms.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id ;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

//    @OneToOne(mappedBy = "userJobSeeker")
//    private JobSeeker jobSeeker;
//
//    @OneToOne(mappedBy = "userSystemPersonnel")
//    private SystemPersonnel systemPersonnel;

}

