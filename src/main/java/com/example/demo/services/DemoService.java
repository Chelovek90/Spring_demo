package com.example.demo.services;

import com.example.demo.entity.DemoApplication;
import com.example.demo.entity.ResolutionStatus;
import com.example.demo.model.DemoList;
import com.example.demo.model.DemoRequest;
import com.example.demo.model.DemoResponse;
import com.example.demo.repository.DemoApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    private final DemoApplicationRepository repository;

    public DemoService(DemoApplicationRepository repository) {
        this.repository = repository;
    }

    public DemoList getAll() {
        return new DemoList(repository.findAll());
    }

    public DemoList getAllSuccessful() {
        List<DemoApplication> allSuccessful = repository.getAllByStatusEquals(ResolutionStatus.SUCCESSFUL);
        return new DemoList(allSuccessful);
    }

    public DemoResponse registerApplication(DemoRequest request) {
        DemoApplication application = new DemoApplication();
        application.setName(request.getName());

        PoliceService policeStatus = new PoliceService();
        IRSService IRS_status = new IRSService();

        if(policeStatus.setPoliceStatus(application) == ResolutionStatus.SUCCESSFUL && IRS_status.setIRS_Status(application) == ResolutionStatus.SUCCESSFUL){
            application.setStatus(ResolutionStatus.SUCCESSFUL);
        }else {
            application.setStatus(ResolutionStatus.DENY);
        }


        application = repository.save(application);
        DemoResponse response = new DemoResponse();

        response.setId(application.getId());
        response.setRequest(request);
        if (application.getStatus() == ResolutionStatus.SUCCESSFUL) {
            response.setResolution("OK");
        } else {
            response.setResolution("Not OK");
        }

        return response;
    }
}
