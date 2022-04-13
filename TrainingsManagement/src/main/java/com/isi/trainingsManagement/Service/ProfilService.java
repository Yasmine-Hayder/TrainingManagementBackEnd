package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.DomaineRepository;
import com.isi.trainingsManagement.Repository.ProfilRepository;
import com.isi.trainingsManagement.model.Domaine;
import com.isi.trainingsManagement.model.Profil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProfilService {
    private ProfilRepository profilRepository;

    @Autowired
    public ProfilService(ProfilRepository profilRepository) {
        this.profilRepository = profilRepository;
    }
    public Profil addProfil(Profil domaine){
        return profilRepository.save(domaine);
    }

    public List<Profil> findAllProfil(){
        return profilRepository.findAll();
    }

    public Profil updateProfil (Profil domaine){
        return profilRepository.save(domaine);
    }

    public void deleteProfil(Long id){
        profilRepository.deleteProfilById(id);
    }

    public Profil findProfilById(Long id){
        return profilRepository.findProfilById(id);
    }
}
