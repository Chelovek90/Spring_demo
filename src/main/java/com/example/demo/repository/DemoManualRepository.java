package com.example.demo.repository;

import com.example.demo.entity.DemoApplication;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class DemoManualRepository {


    EntityManager manager;

    public DemoManualRepository(EntityManager manager) {
        this.manager = manager;
    }

//    public List<DemoApplication> getAllSuccessful() {
//        Query nativeQuery = manager.createNativeQuery(
//                "SELECT * FROM demo_application WHERE status = 0",
//                DemoApplication.class
//        );
//        List<DemoApplication> resultList = nativeQuery.getResultList();
//        return resultList;
//    }
}


