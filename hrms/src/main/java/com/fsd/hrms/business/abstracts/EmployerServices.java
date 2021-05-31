package com.fsd.hrms.business.abstracts;

import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerServices {
    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
}
