package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Participant;
import com.isi.trainingsManagement.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
    void deleteParticipantById(Long id);
    Participant findParticipantById(Long id);
    @Query(value="SELECT * from participants p INNER JOIN Participant_session sp ON p.id=sp.id_participant where sp.id_session=?1",nativeQuery = true)
    List<Participant> findBySessionsId(Long id);

}
