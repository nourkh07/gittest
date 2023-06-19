package com.example.springboot.services;

import com.example.springboot.entities.Moniteur;

public interface IMoniteurService {
    Moniteur addInstructor(Moniteur moniteur, Long numCourse);

}
