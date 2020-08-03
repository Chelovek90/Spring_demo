package com.example.demo.repository;

import com.example.demo.entity.DemoApplication;
import com.example.demo.entity.ResolutionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemoApplicationRepository extends JpaRepository<DemoApplication, Long> {
        List<DemoApplication> getAllByStatusEquals(ResolutionStatus status);
    }
