package com.example.springboot.services;

import com.example.springboot.DAO.ISkieurRepo;
import com.example.springboot.entities.Skieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkieurServiceImpl {
    private final ISkieurRepo skieurRepository;

    @Autowired
    public SkierServiceImpl(ISkieurRepo skieurRepository) {
        this.skieurRepository = skieurRepository;
    }

    @Override
    public List<Skieur> getAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur getSkieurById(Long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public Skieur saveSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void deleteSkieur(Long id) {
        skieurRepository.deleteById(id);
    }

}
