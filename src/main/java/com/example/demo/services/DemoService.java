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
    private final PoliceService policeService;
    private final IRSService IRS_Service;


    public DemoService(DemoApplicationRepository repository, PoliceService policeService, IRSService irs_service) {
        this.repository = repository;
        this.policeService = policeService;
        this.IRS_Service = irs_service;
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

        if(policeService.setPoliceStatus(application) == ResolutionStatus.SUCCESSFUL && IRS_Service.setIRS_Status(application) == ResolutionStatus.SUCCESSFUL){
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
