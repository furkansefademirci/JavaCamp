package com.fsd.hrms.business.adapters;

import FakeMernisService.FakeMernis;
import org.springframework.stereotype.Component;

@Component
public class FakeMernisAdapter {

    private FakeMernis fakeMernis;

    public boolean isOkay(String id){
        fakeMernis = new FakeMernis();
       return fakeMernis.isOkay(id);
       }
}
