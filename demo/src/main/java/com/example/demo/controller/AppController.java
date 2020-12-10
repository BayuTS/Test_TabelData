package com.example.demo.controller;

import java.util.Iterator;
import java.util.List

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.AppModel
import com.example.demo.repository.AppRepo

@RestController
@RequestMapping("/user")
public class AppController {

    @Autowired
    AppRepo.UserRepository userRepository;

    @GetMapping("/")
    public List<User> all(){
        return userRepository.findAll();
    }

    @PostMapping("/")
    public User add(@RequestParam("first_name") String firstName, @RequestParam("last_name") String lastName, @RequestParam("address") String address){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastname(lastName);
        user.setAdress(address);

        return userRepository.save(user);

    }

    @PutMapping("/{id}")
    public User update(@PathVariable("id") Long id, @RequestParam("first_name") String firstname, @RequestParam("last_name") String lastname, @RequestParam("address") String address)

        User user = new User();
    user.setId(id);

    public void setUser(User user) {
        this.user = user;
    }
}
