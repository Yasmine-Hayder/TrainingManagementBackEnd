package com.isi.trainingsManagement.Controller;


import com.isi.trainingsManagement.Service.ParticipantService;

import com.isi.trainingsManagement.model.Participant;
import com.isi.trainingsManagement.model.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ParticipantController {
    private ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping("/participant/all/{id}")
    public ResponseEntity<List<Participant>> getAllParticipant (@PathVariable("id")Long id){
        List<Participant> users=participantService.findParticipantBySession(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/participant/find/{id}")
    public ResponseEntity<List<Participant>> getNotParticipant (@PathVariable("id")Long id){
        List<Participant> users=participantService.findNotParticipantById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/participant/find")
    public ResponseEntity<List<Participant>> getParticipantById (){
        List<Participant> users= participantService.findAllParticipant();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/participant/add")
    public ResponseEntity<Participant> addParticipant (@RequestBody Participant participant){
        Participant newParticipant= participantService.addParticipant(participant);
        return new ResponseEntity<>(newParticipant, HttpStatus.CREATED);
    }

    @PutMapping("/participant/update")
    public ResponseEntity<Participant> updateParticipant (@RequestBody Participant participant){
        Participant updateParticipant= participantService.updateParticipant(participant);
        return new ResponseEntity<>(updateParticipant, HttpStatus.OK);
    }

    @DeleteMapping("/participant/delete/{id}")
    public ResponseEntity<?> deleteParticipant (@PathVariable("id")Long id){
        participantService.deleteParticipant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
