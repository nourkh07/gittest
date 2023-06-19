package com.example.springboot.services;

import com.example.springboot.DAO.ICoursRepo;
import com.example.springboot.DAO.IMoniteurRepo;
import com.example.springboot.entities.Cours;
import com.example.springboot.entities.Moniteur;
import org.springframework.beans.factory.annotation.Autowired;

public class MoniteurServiceImpl {
    private final IMoniteurRepo moniteurRepository;
    private final ICoursRepo coursRepository;

    @Autowired
    public MoniteurServiceImpl(IMoniteurRepo moniteurRepository, ICoursRepo coursRepository) {
        this.moniteurRepository = moniteurRepository;
        this.coursRepository = coursRepository;
    }

    @Override
    public Moniteur addInstructor(Moniteur moniteur, Long numCourse) {
        Cours cours = coursRepository.findById(numCourse).orElse(null);

        if (cours != null) {
            moniteur.getCoursList().add(cours);
            return moniteurRepository.save(moniteur);
        }

        return null;
    }

}
