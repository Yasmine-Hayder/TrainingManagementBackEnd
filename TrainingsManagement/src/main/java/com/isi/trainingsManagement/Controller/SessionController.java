package com.isi.trainingsManagement.Controller;


import com.isi.trainingsManagement.Service.SessionService;

import com.isi.trainingsManagement.model.Formation;
import com.isi.trainingsManagement.model.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SessionController {
    private SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping("/session/all/{id}")
    public ResponseEntity<List<Session>> getAllSession (@PathVariable Long id){
        List<Session> users=sessionService.findSessionByFormation(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/session/find/{id}")
    public ResponseEntity<Session> getSessionById (@PathVariable("id")Long id){
        Session users= sessionService.findSessionById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/session/add")
    public ResponseEntity<Session> addSession (@RequestBody Session session){
        Session newformation= sessionService.addSession(session);
        return new ResponseEntity<>(newformation, HttpStatus.CREATED);
    }

    @PutMapping("/session/update")
    public ResponseEntity<Session> updateSession (@RequestBody Session session){
        Session updateProfil= sessionService.updateSession(session);
        return new ResponseEntity<>(updateProfil, HttpStatus.OK);
    }

    @DeleteMapping("/session/delete/{id}")
    public ResponseEntity<?> deleteSession (@PathVariable("id")Long id){
        sessionService.deleteSession(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
