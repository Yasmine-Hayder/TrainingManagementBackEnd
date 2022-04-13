package com.isi.trainingsManagement.Controller;


import com.isi.trainingsManagement.Service.ProfilService;

import com.isi.trainingsManagement.model.Profil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProfilController {
    private ProfilService profilService;

    public ProfilController(ProfilService profilService) {
        this.profilService = profilService;
    }

    @GetMapping("/profil/all")
    public ResponseEntity<List<Profil>> getAllOrganisme (){
        List<Profil> users=profilService.findAllProfil();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/profil/find/{id}")
    public ResponseEntity<Profil> getOrganismeById (@PathVariable("id")Long id){
        Profil users= profilService.findProfilById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/profil/add")
    public ResponseEntity<Profil> addOrganisme (@RequestBody Profil profil){
        Profil newformation= profilService.addProfil(profil);
        return new ResponseEntity<>(newformation, HttpStatus.CREATED);
    }

    @PutMapping("/profil/update")
    public ResponseEntity<Profil> updateOrganisme (@RequestBody Profil profil){
        Profil updateOrganisme= profilService.updateProfil(profil);
        return new ResponseEntity<>(updateOrganisme, HttpStatus.OK);
    }

    @DeleteMapping("/profil/delete/{id}")
    public ResponseEntity<?> deleteProfil (@PathVariable("id")Long id){
        profilService.deleteProfil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
