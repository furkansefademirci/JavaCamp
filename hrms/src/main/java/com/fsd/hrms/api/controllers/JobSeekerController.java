package com.fsd.hrms.api.controllers;

import com.fsd.hrms.business.abstracts.JobSeekerServices;
import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/job-seeker")
public class JobSeekerController {

    private JobSeekerServices jobSeekerServices;

    @Autowired
    public JobSeekerController(JobSeekerServices jobSeekerServices) {
        this.jobSeekerServices = jobSeekerServices;
    }

    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getAll(){
        return this.jobSeekerServices.getAll();
    }

    @PostMapping(name = "/add")
    public Result add(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerServices.add(jobSeeker);

    }



}
