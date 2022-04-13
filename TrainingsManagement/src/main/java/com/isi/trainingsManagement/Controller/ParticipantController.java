package com.isi.trainingsManagement.Controller;


import com.isi.trainingsManagement.Service.ParticipantService;

import com.isi.trainingsManagement.model.Participant;
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

    @GetMapping("/participant/all")
    public ResponseEntity<List<Participant>> getAllParticipant (){
        List<Participant> users=participantService.findAllParticipant();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/participant/find/{id}")
    public ResponseEntity<Participant> getParticipantById (@PathVariable("id")Long id){
        Participant users= participantService.findParticipantById(id);
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
