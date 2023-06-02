package com.example.springboot.DAO;

import com.example.springboot.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscriptionRepo extends JpaRepository<Inscription, Long> {
}
