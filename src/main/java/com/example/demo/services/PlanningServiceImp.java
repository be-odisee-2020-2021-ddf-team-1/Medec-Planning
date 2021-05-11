package com.example.demo.services;


import com.example.demo.dao.PlanningRepository;
import com.example.demo.domain.Planning;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("planningService")
public class PlanningServiceImp implements PlanningService {
    final
    PlanningRepository _planningRepository;

    public PlanningServiceImp(PlanningRepository planningRepository) {
        _planningRepository = planningRepository;
    }

    //@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public void CreatePlanning(Planning newPlanning){
        _planningRepository.save(newPlanning);
    }
}
