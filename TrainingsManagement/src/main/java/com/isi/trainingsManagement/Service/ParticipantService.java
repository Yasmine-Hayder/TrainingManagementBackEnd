package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.OrganismeRepository;
import com.isi.trainingsManagement.Repository.ParticipantRepository;
import com.isi.trainingsManagement.Repository.SessionRepository;
import com.isi.trainingsManagement.model.Organisme;
import com.isi.trainingsManagement.model.Participant;
import com.isi.trainingsManagement.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ParticipantService {
    private ParticipantRepository participantRepository;
    private SessionRepository sessionRepository;


    @Autowired
    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }
    public Participant addParticipant(Participant organisme){
         return participantRepository.save(organisme);
    }

    public List<Participant> findAllParticipant(){
        return participantRepository.findAll();
    }

    public Participant updateParticipant (Participant organisme){
        return participantRepository.save(organisme);
    }

    public void deleteParticipant(Long id){
        participantRepository.deleteParticipantById(id);
    }

    public List<Participant> findNotParticipantById(Long id){
        return participantRepository.findBySessionsNotId(id);
    }
    public List<Participant> findParticipantBySession(Long id){
        return participantRepository.findBySessionsId(id);
    }
}
