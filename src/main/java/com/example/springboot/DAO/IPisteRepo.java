package com.example.springboot.DAO;

import com.example.springboot.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPisteRepo extends JpaRepository<Piste, Long> {
}
