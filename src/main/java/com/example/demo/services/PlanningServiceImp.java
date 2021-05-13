package com.example.demo.services;


import com.example.demo.dao.PlanningRepository;
import com.example.demo.domain.Planning;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public void UpdatePlanning(Planning planning){_planningRepository.save(planning);}
    @Override
    public Optional<Planning> getPlanningById(long planningId) {
        return Optional.empty();
    }

    @Override
    public Planning getPlanningByNaam(String planningNaam) {
        return null;
    }

    @Override
    public void deletePlanning(long planningId) {

    }

    public Optional<Planning> getPlanningById(Long planningId){
        return  _planningRepository.findById(planningId);
     }


}
