package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Organisme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganismeRepository extends JpaRepository<Organisme, Integer> {
    void deleteOrganismeById(Long id);
    Organisme findOrganismeById(Long id);
}
