package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil, Integer> {
    void deleteProfilById(Long id);
    Profil findProfilById(Long id);
}
