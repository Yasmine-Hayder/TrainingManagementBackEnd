package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.FormationRepository;
import com.isi.trainingsManagement.Repository.OrganismeRepository;
import com.isi.trainingsManagement.model.Formation;
import com.isi.trainingsManagement.model.Organisme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrganismeService {

    private OrganismeRepository organismeRepository;

    @Autowired
    public OrganismeService(OrganismeRepository organismeRepository) {
        this.organismeRepository = organismeRepository;
    }
    public Organisme addOrganisme(Organisme organisme){
        return organismeRepository.save(organisme);
    }

    public List<Organisme> findAllOrganisme(){
        return organismeRepository.findAll();
    }

    public Organisme updateOrganisme (Organisme organisme){
        return organismeRepository.save(organisme);
    }

    public void deleteOrganisme(Long id){
        organismeRepository.deleteOrganismeById(id);
    }

    public Organisme findOrganismeById(Long id){
        return organismeRepository.findOrganismeById(id);
    }
}
