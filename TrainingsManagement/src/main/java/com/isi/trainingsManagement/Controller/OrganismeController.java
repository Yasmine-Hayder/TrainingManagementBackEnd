package com.isi.trainingsManagement.Controller;

import com.isi.trainingsManagement.Service.OrganismeService;
import com.isi.trainingsManagement.model.Organisme;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class OrganismeController {
    private OrganismeService organismeService;

    public OrganismeController(OrganismeService organismeService) {
        this.organismeService = organismeService;
    }

    @GetMapping("/organisme/all")
    public ResponseEntity<List<Organisme>> getAllOrganisme (){
        List<Organisme> users=organismeService.findAllOrganisme();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/organisme/find/{id}")
    public ResponseEntity<Organisme> getOrganismeById (@PathVariable("id")Long id){
        Organisme users= organismeService.findOrganismeById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/organisme/add")
    public ResponseEntity<Organisme> addOrganisme (@RequestBody Organisme organisme){
        Organisme newformation= organismeService.addOrganisme(organisme);
        return new ResponseEntity<>(newformation, HttpStatus.CREATED);
    }

    @PutMapping("/organisme/update")
    public ResponseEntity<Organisme> updateOrganisme (@RequestBody Organisme organisme){
        Organisme updateOrganisme= organismeService.updateOrganisme(organisme);
        return new ResponseEntity<>(updateOrganisme, HttpStatus.OK);
    }

    @DeleteMapping("/organisme/delete/{id}")
    public ResponseEntity<?> deleteOrganisme (@PathVariable("id")Long id){
        organismeService.deleteOrganisme(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
