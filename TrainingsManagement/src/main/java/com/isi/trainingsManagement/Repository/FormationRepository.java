package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Integer> {
    void deleteFormationById(Long id);
    Formation findFormationById(Long id);

}
