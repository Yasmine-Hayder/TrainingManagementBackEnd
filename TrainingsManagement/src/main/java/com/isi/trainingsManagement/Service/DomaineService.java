package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.DomaineRepository;

import com.isi.trainingsManagement.model.Domaine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DomaineService  {
    private DomaineRepository domaineRepository;

    @Autowired
    public DomaineService(DomaineRepository domaineRepository) {
        this.domaineRepository = domaineRepository;
    }
    public Domaine addDomaine(Domaine domaine){
        return domaineRepository.save(domaine);
    }

    public List<Domaine> findAllDomaine(){
        return domaineRepository.findAll();
    }

    public Domaine updateDomaine (Domaine domaine){
        return domaineRepository.save(domaine);
    }

    public void deleteDomaine(Long id){
        domaineRepository.deleteDomaineById(id);
    }

    public Domaine findDomaineById(Long id){
        return domaineRepository.findDomaineById(id);
    }
}
