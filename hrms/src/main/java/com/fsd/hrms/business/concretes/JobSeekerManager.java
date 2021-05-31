package com.fsd.hrms.business.concretes;

import com.fsd.hrms.business.abstracts.AuthServices;
import com.fsd.hrms.business.abstracts.JobSeekerServices;
import com.fsd.hrms.business.adapters.FakeMernisAdapter;
import com.fsd.hrms.core.utilities.results.*;
import com.fsd.hrms.dataAccess.abstracts.JobSeekerDao;
import com.fsd.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerServices {

    private JobSeekerDao jobSeekerDao;
    private AuthServices authServices;


    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao,AuthServices authServices) {
        this.jobSeekerDao = jobSeekerDao;
        this.authServices = authServices;

    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<>(this.jobSeekerDao.findAll(),"İş arayanlar listesi listelendi");
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
    if (authServices.checkInfo(jobSeeker.getUserJobSeeker().getEmail(), jobSeeker.getNationalityNumber())){
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("Kullanıcı kaydı başarılı");
    }
    else return new ErrorResult(authServices.getMessageDetail());





    }
}
