package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays, Integer> {
    void deletePaysById(Long id);
    Pays findPaysById(Long id);
}
