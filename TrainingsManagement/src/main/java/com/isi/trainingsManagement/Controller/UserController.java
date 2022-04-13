package com.isi.trainingsManagement.Controller;

import com.isi.trainingsManagement.Repository.UserRepository;
import com.isi.trainingsManagement.Service.UserService;
import com.isi.trainingsManagement.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser (){
        List<User> users=userService.findAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login (@RequestBody User userData){
        User user=userService.findUserByLogin(userData.getLogin());
        if(user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUserById (@PathVariable("id")int id){
        User users= userService.findUserById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser (@RequestBody User userData){
        User user=userService.findUserByLogin(userData.getLogin());
        if(user==null){
        User newUser= userService.addUser(userData);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);}
        return (ResponseEntity<User>) ResponseEntity.internalServerError();

    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser (@RequestBody User user){
        User updateUser= userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser (@PathVariable("id")int id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
