package com.fsd.hrms.api.controllers;

import com.fsd.hrms.business.abstracts.JobServices;
import com.fsd.hrms.dataAccess.abstracts.JobDao;
import com.fsd.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/jobs")
public class JobsController {

    private JobServices jobServices;

    @Autowired
    public JobsController(JobServices jobServices) {
        this.jobServices = jobServices;
    }

    @GetMapping("/getall")
    public List<Job> getAll(){
       return this.jobServices.getAll();
    }

}
