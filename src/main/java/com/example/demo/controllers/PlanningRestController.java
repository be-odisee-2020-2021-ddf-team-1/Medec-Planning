package com.example.demo.controllers;

import com.example.demo.dao.PlanningRepository;
import com.example.demo.domain.Planning;
import com.example.demo.services.PlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8888", maxAge = 3600, allowCredentials = "true")
@RequestMapping(path = "/planning",produces = "application/json")

public class PlanningRestController {
    @Autowired
    private PlanningRepository _planningRepository;
    @Autowired
    private PlanningService _planningService;

    @PostMapping(path={"/createPlanning"},consumes = "application/json")
    public void createPlannning(String name) {
        Planning planning=new Planning();
        planning.setName(name);
        _planningService.CreatePlanning(planning);
    }
    @PutMapping(path={"/updatePlanning/{id}"},consumes = "application/json")
    public void update(@PathVariable("id") Integer id, @RequestBody Planning planning)
    {
        planning.setPlanningId(id);
        _planningService.UpdatePlanning(planning);
    }


}
