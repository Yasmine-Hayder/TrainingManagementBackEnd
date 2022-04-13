package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.ProfilRepository;
import com.isi.trainingsManagement.Repository.SessionRepository;
import com.isi.trainingsManagement.model.Formation;
import com.isi.trainingsManagement.model.Profil;
import com.isi.trainingsManagement.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SessionService {
    private SessionRepository profilRepository;

    @Autowired
    public SessionService(SessionRepository profilRepository) {
        this.profilRepository = profilRepository;
    }
    public Session addSession(Session domaine){
        return profilRepository.save(domaine);
    }

    public List<Session> findAllSession(){
        return profilRepository.findAll();
    }

    public Session updateSession (Session domaine){
        return profilRepository.save(domaine);
    }

    public void deleteSession(Long id){
        profilRepository.deleteSessionById(id);
    }

    public Session findSessionById(Long id){
        return profilRepository.findSessionById(id);
    }
    public List<Session> findSessionByFormation(Long id){
        return profilRepository.findByFormationId(id);
    }

}
