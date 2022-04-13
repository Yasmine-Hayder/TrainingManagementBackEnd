package com.isi.trainingsManagement.Controller;

import com.isi.trainingsManagement.Service.FormateurService;
import com.isi.trainingsManagement.model.Formateur;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FormateurController {

    private FormateurService formateurService;

    public FormateurController(FormateurService formateurService) {
        this.formateurService = formateurService;
    }

    @GetMapping("/formateur/all")
    public ResponseEntity<List<Formateur>> getAllFormateur (){
        List<Formateur> users=formateurService.findAllFormateur();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/formateur/find/{id}")
    public ResponseEntity<Formateur> getFormateurById (@PathVariable("id")Long id){
        Formateur users= formateurService.findFormateurById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/formateur/add")
    public ResponseEntity<Formateur> addFormateur (@RequestBody Formateur user){
        Formateur newDomaine= formateurService.addFormateur(user);
        return new ResponseEntity<>(newDomaine, HttpStatus.CREATED);
    }

    @PutMapping("/formateur/update")
    public ResponseEntity<Formateur> updateFormateur(@RequestBody Formateur user){
        Formateur updateFormateur= formateurService.updateFormateur(user);
        return new ResponseEntity<>(updateFormateur, HttpStatus.OK);
    }

    @DeleteMapping("/formateur/delete/{id}")
    public ResponseEntity<?> deleteDomaine (@PathVariable("id")Long id){
        formateurService.deleteFormateur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
