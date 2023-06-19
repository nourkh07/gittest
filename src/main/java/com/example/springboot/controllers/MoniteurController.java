package com.example.springboot.controllers;

import com.example.springboot.entities.Moniteur;
import com.example.springboot.services.IMoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/moniteurs")

public class MoniteurController {
    @Autowired
    IMoniteurService moniteurService;

    @PostMapping("/add/{numCours}")
    public Moniteur addMoniteurAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable("numCours") Long numCours){
        return moniteurService.addMoniteurAndAssignToCourse(moniteur, numCours);
    }

}
