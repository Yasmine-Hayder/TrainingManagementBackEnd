package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.DomaineRepository;
import com.isi.trainingsManagement.Repository.FormateurRepository;
import com.isi.trainingsManagement.model.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FormateurService {
    private FormateurRepository formateurRepository;

    @Autowired
    public FormateurService(FormateurRepository formateurRepository) {
        this.formateurRepository = formateurRepository;
    }
    public Formateur addFormateur(Formateur formateur){
        return formateurRepository.save(formateur);
    }

    public List<Formateur> findAllFormateur(){
        return formateurRepository.findAll();
    }

    public Formateur updateFormateur (Formateur domaine){
        return formateurRepository.save(domaine);
    }

    public void deleteFormateur(Long id){
        formateurRepository.deleteFormateurById(id);
    }

    public Formateur findFormateurById(Long id){
        return formateurRepository.findFormateurById(id);
    }
}
