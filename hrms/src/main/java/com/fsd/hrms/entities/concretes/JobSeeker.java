package com.fsd.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "job_seeker")
public class JobSeeker  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_number")
    private String nationalityNumber;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "job_id")
    private int jobId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Users userJobSeeker;

}




