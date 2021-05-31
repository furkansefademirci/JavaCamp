package com.fsd.hrms.api.controllers;

import com.fsd.hrms.business.abstracts.JobServices;
import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public DataResult<List<Job>> getAll(){
       return this.jobServices.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Job job){
        return this.jobServices.add(job);

    }

}
