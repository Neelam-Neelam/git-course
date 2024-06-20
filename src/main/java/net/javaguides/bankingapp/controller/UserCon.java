package net.javaguides.bankingapp.controller;

import net.javaguides.bankingapp.model.User;
import net.javaguides.bankingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Banking")
public class UserCon {
  @Autowired
    private UserService userService;

    @PostMapping("/saveUsers")
    public List<User> saveUsers(@RequestBody List<User> users) {
        return userService.saveUsers(users);
    }
    @GetMapping("/getUsers")
    public List<User> getAllUsers() {
      return userService.getUsers();
    }
    @GetMapping("/getUsersByName/{name}")
    public List<User> getUsersByName(@PathVariable String name){
      return userService.getUsersByName(name);
    }
    @GetMapping("/getcount/{age}")
    public String getCount(@PathVariable int age){
      int count = userService.getCount(age);
      return "count is " + count;
    }

@DeleteMapping("/deleteUser/{name}")
public List<User> deleteUser(@PathVariable String name){
      return userService.deleteUserByName(name);
}





}
