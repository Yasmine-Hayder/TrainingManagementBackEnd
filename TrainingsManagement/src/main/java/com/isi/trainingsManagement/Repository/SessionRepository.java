package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.Formation;
import com.isi.trainingsManagement.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Integer> {
    void deleteSessionById(Long id);
    Session findSessionById(Long id);
    List<Session>  findByFormationId(Long id);
}
