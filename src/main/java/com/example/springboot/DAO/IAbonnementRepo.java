package com.example.springboot.DAO;

import com.example.springboot.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAbonnementRepo extends JpaRepository<Abonnement, Long> {

}
