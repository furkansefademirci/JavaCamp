package com.fsd.hrms.api.controllers;

import com.fsd.hrms.business.abstracts.EmployerServices;
import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.entities.concretes.Employer;
import com.fsd.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employer")
public class EmployerController {

    private EmployerServices employerServices;

    @Autowired
    public EmployerController(EmployerServices employerServices) {
        this.employerServices = employerServices;
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll(){
        return this.employerServices.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer) {
        return this.employerServices.add(employer);
    }

}
