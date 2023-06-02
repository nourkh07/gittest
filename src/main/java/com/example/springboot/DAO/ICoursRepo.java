package com.example.springboot.DAO;

import com.example.springboot.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursRepo extends JpaRepository<Cours, Long> {

}
