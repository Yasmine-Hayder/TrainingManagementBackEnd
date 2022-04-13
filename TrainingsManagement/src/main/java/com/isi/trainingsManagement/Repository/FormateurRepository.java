package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormateurRepository extends JpaRepository<Formateur, Integer> {
    void deleteFormateurById(Long id);
    Formateur findFormateurById(Long id);
}
