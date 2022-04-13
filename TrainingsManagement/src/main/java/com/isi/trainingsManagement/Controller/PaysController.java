package com.isi.trainingsManagement.Controller;


import com.isi.trainingsManagement.Service.PaysService;

import com.isi.trainingsManagement.model.Pays;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PaysController {
    private PaysService paysService;

    public PaysController(PaysService paysService) {
        this.paysService = paysService;
    }

    @GetMapping("/pays/all")
    public ResponseEntity<List<Pays>> getAllPays (){
        List<Pays> users=paysService.findAllPays();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/pays/find/{id}")
    public ResponseEntity<Pays> getPaysById (@PathVariable("id")Long id){
        Pays users= paysService.findPaysById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/pays/add")
    public ResponseEntity<Pays> addPays (@RequestBody Pays pays){
        Pays newformation= paysService.addPays(pays);
        return new ResponseEntity<>(newformation, HttpStatus.CREATED);
    }

    @PutMapping("/pays/update")
    public ResponseEntity<Pays> updatePays (@RequestBody Pays pays){
        Pays updateOrganisme= paysService.updatePays(pays);
        return new ResponseEntity<>(updateOrganisme, HttpStatus.OK);
    }

    @DeleteMapping("/pays/delete/{id}")
    public ResponseEntity<?> deletePays (@PathVariable("id")Long id){
        paysService.deletePays(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
