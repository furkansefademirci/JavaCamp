package com.fsd.hrms.entities.concretes;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "employer_company")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "website")
    private String webSite;
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Users userSystemPersonel;


}
