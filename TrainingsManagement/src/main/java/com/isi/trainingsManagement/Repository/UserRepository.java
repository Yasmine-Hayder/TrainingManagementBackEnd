package com.isi.trainingsManagement.Repository;

import com.isi.trainingsManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
    void deleteUserById(int id);
    User findUserById(int id);
    User findUserByLogin(String login);

}
