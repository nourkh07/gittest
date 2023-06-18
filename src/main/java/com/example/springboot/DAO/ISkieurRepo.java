package com.example.springboot.DAO;

import com.example.springboot.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ISkieurRepo extends JpaRepository<Skieur, Long> {

    public Skieur findbyNamAndPrenom(String nom, String prenom);
    public List<Skieur> findbydateNaissanceGreaterThan(Date dateNaiss);
    public Skieur findByNomAndPrenomAndDateNaissance(String nom, String prenom, Date dateNaiss);

}
