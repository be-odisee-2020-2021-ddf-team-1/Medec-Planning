package com.example.demo.services;


import com.example.demo.domain.Planning;

import java.util.Optional;

public interface PlanningService {


        void CreatePlanning(Planning planning);
        void UpdatePlanning(Planning planning);

   Optional<Planning> getPlanningById(long planningId);

    Planning getPlanningByNaam(String planningNaam);

    void deletePlanning(long planningId);

    //List<Planning> getPlannings();

    }




