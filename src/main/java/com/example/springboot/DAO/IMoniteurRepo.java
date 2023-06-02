package com.example.springboot.DAO;

import com.example.springboot.entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMoniteurRepo extends JpaRepository<Moniteur,Long> {
}
