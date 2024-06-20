package net.javaguides.bankingapp.dao;

import net.javaguides.bankingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    List<User> findUsersByName(String name);

     int findByAge(int count);

    List<User> deleteByName(String name);

}
