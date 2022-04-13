package com.isi.trainingsManagement.Controller;

import com.isi.trainingsManagement.Service.FormationService;

import com.isi.trainingsManagement.model.Formation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FormationController {
    private FormationService formationService;

    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }

    @GetMapping("/formation/all")
    public ResponseEntity<List<Formation>> getAllFormation (){
        List<Formation> users=formationService.findAllFormation();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/formation/find/{id}")
    public ResponseEntity<Formation> getFormationById (@PathVariable("id")Long id){
        Formation users= formationService.findFormationById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/formation/add")
    public ResponseEntity<Formation> addFormation (@RequestBody Formation formation){
        Formation newformation= formationService.addFormation(formation);
        return new ResponseEntity<>(newformation, HttpStatus.CREATED);
    }

    @PutMapping("/formation/update")
    public ResponseEntity<Formation> updateFormation (@RequestBody Formation formation){
        Formation updateformation= formationService.updateFormation(formation);
        return new ResponseEntity<>(updateformation, HttpStatus.OK);
    }

    @DeleteMapping("/formation/delete/{id}")
    public ResponseEntity<?> deleteFormation (@PathVariable("id")Long id){
        formationService.deleteFormation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
