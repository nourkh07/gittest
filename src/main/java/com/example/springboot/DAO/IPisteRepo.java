package com.example.springboot.DAO;

import com.example.springboot.entities.Couleur;
import com.example.springboot.entities.Piste;
import com.example.springboot.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IPisteRepo extends JpaRepository<Piste, Long> {
//Keywords
    List<Piste> findAllByCouleurAndLongueur (Couleur couleur, int longueur);
List<Piste> findAllByPenteLessThanAndLongueurGreaterThan(int p, int l);
List<Piste> findAllBySkieursNotIn(Set<Skieur> skieurs);

// JPQL
    @Query("SELECT p FROM Piste p "+
    "INNER JOIN p.skieurs s " +
    "INNER JOIN s.inscriptions i " +
    "WHERE i.numSemaine = :nums")
    List<Piste> listPistesSelonSemaine(@Param("nums") int numSemaine);

}
