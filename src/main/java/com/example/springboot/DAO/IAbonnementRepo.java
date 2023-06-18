package com.example.springboot.DAO;

import com.example.springboot.entities.Abonnement;
import com.example.springboot.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IAbonnementRepo extends JpaRepository<Abonnement, Long> {
    @Query("SELECT a FROM Abonnement a WHERE a.typeAbon = :typeAbon ORDER BY a.dateDebut")
    List<Abonnement> findByTypeAbonnementOrderByDateDebut(@Param("typeAbon") TypeAbonnement typeAbon);

    @Query("SELECT a FROM Abonnement a WHERE a.dateDebut BETWEEN :startDate AND :endDate")
    List<Abonnement> findByDateDebutBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("SELECT DISTINCT WEEK(m.dateCours) FROM Moniteur m WHERE m.support = :support")
    List<Integer> findNumSemainesByMoniteurAndSupport(@Param("support") String support);

}
