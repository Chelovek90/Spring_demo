package com.example.demo.services;

import com.example.demo.entity.DemoApplication;
import com.example.demo.entity.ResolutionStatus;
import org.springframework.stereotype.Service;

@Service
public class IRSService {
    public ResolutionStatus setIRS_Status(DemoApplication application){
        if ((application.getName().length()) % 3 == 0) {
            application.setStatus(ResolutionStatus.LOW_BUDGET);
        }else {
            application.setStatus(ResolutionStatus.SUCCESSFUL);
        }
        return application.getStatus();
    }
}
