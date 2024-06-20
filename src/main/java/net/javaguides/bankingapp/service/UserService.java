package net.javaguides.bankingapp.service;

import net.javaguides.bankingapp.dao.UserRepo;
import net.javaguides.bankingapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//hello how are you

@Service
public class UserService {
     @Autowired
    private UserRepo userrepo;


     public List<User> saveUsers(List<User> users) {
         return userrepo.saveAll(users);
     }

     public List<User> getUsers() {
         return userrepo.findAll();
     }

     public List<User> getUsersByName(String name) {
         return userrepo.findUsersByName(name);
     }

     public int getCount(int count){
         return userrepo.findByAge(count);
     }

   public List<User> deleteUserByName(String name)
   {
       return userrepo.deleteByName(name);
   }
   public User getUserById(int id) {
         return userrepo.findById(id).orElse(null);
   }




}
