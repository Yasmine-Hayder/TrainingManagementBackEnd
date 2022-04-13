package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.ParticipantRepository;
import com.isi.trainingsManagement.Repository.PaysRepository;
import com.isi.trainingsManagement.model.Participant;
import com.isi.trainingsManagement.model.Pays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaysService {
    private PaysRepository paysRepository;

    @Autowired
    public PaysService(PaysRepository paysRepository) {
        this.paysRepository = paysRepository;
    }
    public Pays addPays(Pays organisme){
        return paysRepository.save(organisme);
    }

    public List<Pays> findAllPays(){
        return paysRepository.findAll();
    }

    public Pays updatePays(Pays organisme){
        return paysRepository.save(organisme);
    }

    public void deletePays(Long id){
        paysRepository.deletePaysById(id);
    }

    public Pays findPaysById(Long id){
        return paysRepository.findPaysById(id);
    }
}
