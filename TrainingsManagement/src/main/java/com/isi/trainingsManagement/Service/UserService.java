package com.isi.trainingsManagement.Service;

import com.isi.trainingsManagement.Repository.UserRepository;
import com.isi.trainingsManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public User updateUser (User user){
        return userRepository.save(user);
    }

    public void deleteUser(int id){
        userRepository.deleteUserById(id);
    }

    public User findUserById(int id){
        return userRepository.findUserById(id);
    }
    public User findUserByLogin(String login){
        return userRepository.findUserByLogin(login);
    }
}
