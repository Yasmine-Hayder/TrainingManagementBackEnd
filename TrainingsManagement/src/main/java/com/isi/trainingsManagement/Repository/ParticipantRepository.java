package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
    void deleteParticipantById(Long id);
    Participant findParticipantById(Long id);
}
