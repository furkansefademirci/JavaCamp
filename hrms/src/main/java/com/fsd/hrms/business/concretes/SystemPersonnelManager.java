package com.fsd.hrms.business.concretes;

import com.fsd.hrms.business.abstracts.SystemPersonnelServices;
import com.fsd.hrms.core.utilities.results.DataResult;
import com.fsd.hrms.core.utilities.results.Result;
import com.fsd.hrms.core.utilities.results.SuccessDataResult;
import com.fsd.hrms.core.utilities.results.SuccessResult;
import com.fsd.hrms.dataAccess.abstracts.SystemPersonnelDao;
import com.fsd.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonnelManager implements SystemPersonnelServices {

    private SystemPersonnelDao systemPersonnelDao;

    @Autowired
    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
        this.systemPersonnelDao = systemPersonnelDao;
    }

    @Override
    public DataResult<List<SystemPersonnel>> getAll() {
        return new SuccessDataResult(systemPersonnelDao.findAll(),"Sistem personelleri listelendi");
    }

    @Override
    public Result add(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("Yeni personel kayıt edildi.");
    }
}
