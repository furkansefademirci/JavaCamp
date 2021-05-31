package com.fsd.hrms.business.abstracts;

import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelServices {
    DataResult<List<SystemPersonnel>> getAll();
    Result add(SystemPersonnel systemPersonnel);

}
