package com.fsd.hrms.business.concretes;


import com.fsd.hrms.business.abstracts.AuthServices;

import com.fsd.hrms.business.adapters.FakeMernisAdapter;
import com.fsd.hrms.dataAccess.abstracts.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthManager implements AuthServices {

    private String messageDetail = "";
    private UserDao userDao;
    private FakeMernisAdapter fakeMernisAdapter;

    @Autowired
    public AuthManager(UserDao userDao, FakeMernisAdapter fakeMernisAdapter) {
        this.userDao = userDao;
        this.fakeMernisAdapter = fakeMernisAdapter;
    }

    @Override
    public boolean checkEmail(String email) {
        this.messageDetail = "";

        if(!this.userDao.findUsersByEmail(email).isEmpty())
        {
            this.messageDetail += "Girdiginiz mail zaten sistemde mevcut.";
            return false;
        }

        return true;

    }

    @Override
    public boolean isNationalityNumberValid(String id) {
        this.messageDetail = "";

        if (!fakeMernisAdapter.isOkay(id)){
            this.messageDetail += "Hatalı TC kimlik no";
            return false;
        }
        else return true;
    }

    @Override
    public boolean checkInfo(String email, String id) {
        return (isNationalityNumberValid(id) & checkEmail(email));
    }

    public String getMessageDetail(){
        return this.messageDetail;
    }

}
