package org.example.amsbackend.controllers;

import org.example.amsbackend.entities.Users;
import org.example.amsbackend.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/users/{userId}")
    public Users getUser(@PathVariable Integer userId) {return this.userService.findByUserId(userId);}

    @CrossOrigin(origins = "*")
    @GetMapping("/accounts/{pan}")
    public Users getPan(@PathVariable String pan) {return this.userService.findByPan(pan);}

    @CrossOrigin(origins = "*")
    @PostMapping("/accounts")
    public Users saveUser(@RequestBody Users customer) {return this.userService.saveUsers(customer);}
}
