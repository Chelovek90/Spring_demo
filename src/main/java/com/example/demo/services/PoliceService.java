package com.example.demo.services;

import com.example.demo.entity.DemoApplication;
import com.example.demo.entity.ResolutionStatus;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class PoliceService {

    public ResolutionStatus setPoliceStatus(DemoApplication application) {
        List<ResolutionStatus> resolutionStatusList = Arrays.asList(ResolutionStatus.SUCCESSFUL, ResolutionStatus.BAD_CLIENT);
        Random random = new Random();
        ResolutionStatus resolutionStatus = resolutionStatusList.get(random.nextInt(resolutionStatusList.size()));
        return resolutionStatus;
    }

}
