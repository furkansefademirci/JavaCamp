package com.fsd.hrms.business.abstracts;

import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerServices {
    DataResult<List<JobSeeker>> getAll();
    Result add(JobSeeker jobSeeker);
}
