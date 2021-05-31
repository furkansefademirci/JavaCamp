package com.fsd.hrms.api.controllers;

import com.fsd.hrms.business.abstracts.SystemPersonnelServices;
import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.core.utilities.results.SuccessDataResult;
import com.fsd.hrms.entities.concretes.SystemPersonnel;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/system-personel")
public class SystemPersonnelController {

    private SystemPersonnelServices systemPersonnelServices;

    @Autowired
    public SystemPersonnelController(SystemPersonnelServices systemPersonnelServices) {
        this.systemPersonnelServices = systemPersonnelServices;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemPersonnel>> getAll(){
        return this.systemPersonnelServices.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemPersonnel systemPersonnel){
        return this.systemPersonnelServices.add(systemPersonnel);
    }
}
