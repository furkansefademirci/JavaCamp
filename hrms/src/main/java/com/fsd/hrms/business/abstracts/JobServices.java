package com.fsd.hrms.business.abstracts;

import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.entities.concretes.Job;

import java.util.List;

public interface JobServices {
   DataResult<List<Job>> getAll();
   Result add(Job job);


}
