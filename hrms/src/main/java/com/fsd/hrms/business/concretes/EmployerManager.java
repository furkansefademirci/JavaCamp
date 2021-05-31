package com.fsd.hrms.business.concretes;

import com.fsd.hrms.business.abstracts.AuthServices;
import com.fsd.hrms.business.abstracts.EmployerServices;
import com.fsd.hrms.core.utilities.results.*;
import com.fsd.hrms.dataAccess.abstracts.EmployerDao;
import com.fsd.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerServices {

    private EmployerDao employerDao;
    private AuthServices authServices;
    @Autowired
    public EmployerManager(EmployerDao employerDao,AuthServices authServices) {
        this.employerDao = employerDao;
        this.authServices = authServices;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(employerDao.findAll(),"İş verenler listesi listelendi");
    }

    @Override
    public Result add(Employer employer) {
    if (authServices.checkEmail(employer.getUserSystemPersonel().getEmail())){
        this.employerDao.save(employer);
        return new SuccessResult("İşveren kayıt edildi");
    }

    else return new ErrorResult("Girilen email adresi daha önce alınmış");
    }
}
