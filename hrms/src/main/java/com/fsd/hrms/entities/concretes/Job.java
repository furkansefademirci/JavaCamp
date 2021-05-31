package com.fsd.hrms.entities.concretes;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String jobName;

}
