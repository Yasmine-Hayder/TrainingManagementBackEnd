package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomaineRepository extends JpaRepository<Domaine, Long> {
    void deleteDomaineById(Long id);
    Domaine findDomaineById(Long id);
}
