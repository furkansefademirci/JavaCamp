package com.fsd.hrms.business.abstracts;


import com.fsd.hrms.core.utilities.results.Result;
import org.springframework.stereotype.Component;

@Component
public interface AuthServices {
    boolean checkEmail(String email);
    boolean isNationalityNumberValid(String id);
    boolean checkInfo(String email, String id);
    String getMessageDetail();
}
