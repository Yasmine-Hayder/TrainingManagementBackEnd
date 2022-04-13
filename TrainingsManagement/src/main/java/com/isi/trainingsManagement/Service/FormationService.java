package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.FormateurRepository;
import com.isi.trainingsManagement.Repository.FormationRepository;
import com.isi.trainingsManagement.model.Formateur;
import com.isi.trainingsManagement.model.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FormationService {
    private FormationRepository formationRepository;

    @Autowired
    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }
    public Formation addFormation(Formation formation){

        return formationRepository.save(formation);
    }

    public List<Formation> findAllFormation(){
        return formationRepository.findAll();
    }

    public Formation updateFormation (Formation formation){
        return formationRepository.save(formation);
    }

    public void deleteFormation(Long id){
        formationRepository.deleteFormationById(id);
    }

    public Formation findFormationById(Long id){
        return formationRepository.findFormationById(id);
    }
}
