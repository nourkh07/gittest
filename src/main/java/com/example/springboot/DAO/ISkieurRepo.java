package com.example.springboot.DAO;

import com.example.springboot.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkieurRepo extends JpaRepository<Skieur, Long> {
}
