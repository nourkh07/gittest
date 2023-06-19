package com.example.springboot.controllers;
import com.example.springboot.entities.Skieur;
import com.example.springboot.services.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieurs")
public class SkieurController {
    private final ISkieurService skieurService;

    @Autowired
    public SkieurController(ISkieurService skieurService) {
        this.skieurService = skieurService;
    }

    @GetMapping("")
    public List<Skieur> getAllSkieurs() {
        return skieurService.getAllSkieurs();
    }

    @GetMapping("/{skieurId}")
    public Skieur getSkieurById(@PathVariable("skieurId") Long skieurId) {
        return skieurService.getSkieurById(skieurId);
    }

    @PostMapping("/add")
    public Skieur saveSkieur(@RequestBody Skieur skieur) {
        return skieurService.saveSkieur(skieur);
    }

    @DeleteMapping("/{skieurId}")
    public void deleteSkieur(@PathVariable("skieurId") Long skieurId) {
        skieurService.deleteSkieur(skieurId);
    }

    @PutMapping("")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return skieurService.updateSkieur(skieur);
    }

}
