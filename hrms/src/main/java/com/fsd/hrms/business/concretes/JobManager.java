package com.fsd.hrms.business.concretes;

import com.fsd.hrms.business.abstracts.JobServices;
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
    public List<Job> getAll() {
        return this.jobDao.findAll();
    }
}
