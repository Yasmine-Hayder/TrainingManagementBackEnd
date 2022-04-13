package com.isi.trainingsManagement.Controller;


import com.isi.trainingsManagement.Service.DomaineService;
import com.isi.trainingsManagement.model.Domaine;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DomaineController {
    private DomaineService domaineService;

    public DomaineController(DomaineService domaineService) {
        this.domaineService = domaineService;
    }

    @GetMapping("/domaine/all")
    public ResponseEntity<List<Domaine>> getAllDomaine (){
        List<Domaine> users=domaineService.findAllDomaine();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/domaine/find/{id}")
    public ResponseEntity<Domaine> getDomaineById (@PathVariable("id")Long id){
        Domaine users= domaineService.findDomaineById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/domaine/add")
    public ResponseEntity<Domaine> addDomaine (@RequestBody Domaine user){
        Domaine newDomaine= domaineService.addDomaine(user);
        return new ResponseEntity<>(newDomaine, HttpStatus.CREATED);
    }

    @PutMapping("/domaine/update")
    public ResponseEntity<Domaine> updateDomaine (@RequestBody Domaine user){
        Domaine updateDomaine= domaineService.updateDomaine(user);
        return new ResponseEntity<>(updateDomaine, HttpStatus.OK);
    }

    @DeleteMapping("/domaine/delete/{id}")
    public ResponseEntity<?> deleteDomaine (@PathVariable("id")Long id){
        domaineService.deleteDomaine(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
