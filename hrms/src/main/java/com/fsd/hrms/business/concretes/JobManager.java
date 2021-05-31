package com.fsd.hrms.business.concretes;

import com.fsd.hrms.business.abstracts.JobServices;
import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.core.utilities.results.SuccessDataResult;
import com.fsd.hrms.core.utilities.results.SuccessResult;
import com.fsd.hrms.dataAccess.abstracts.JobDao;
import com.fsd.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobManager implements JobServices {
    private JobDao jobDao;


    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<>(this.jobDao.findAll(),"Meslekler listelendi");

    }

    @Override
    public Result add(Job job) {


        this.jobDao.save(job);
        return new SuccessResult("Meslek eklendi");
    }


}
