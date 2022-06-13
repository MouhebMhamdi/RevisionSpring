package tn.esprit.ExamenSpring.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ExamenSpring.Entities.User;
import tn.esprit.ExamenSpring.Services.IUserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService iUserService;


    @GetMapping("/all")
    public List<User> getAlUser(){
        return  iUserService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserBYId(@PathVariable int id){
        return iUserService.getUserById(id);
    }


    @PostMapping("/add")
    public List<User> addUser(@RequestBody User user){
        return iUserService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        iUserService.deleteUserById(id);
        return "User deleted";
    }

    @DeleteMapping("/all")
    public String deleteAllUsers(){
          iUserService.deleteAllUsers();
          return "All users deleted ";
    }

    @PutMapping("/{id}")
    public User updateUSer(@PathVariable int id,@RequestBody User user){
        return iUserService.updateUser(id,user);

    }

}
