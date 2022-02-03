package org.example.amsbackend.controllers;

import org.example.amsbackend.entities.Bankers;
import org.example.amsbackend.services.BankerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankerController {
    private BankerService bankerService;
    public BankerController(BankerService bankerService) {this.bankerService = bankerService;}
    @PostMapping("/bankers")
    public Bankers findBanker(@RequestBody Bankers bankerInput) {
        return bankerService.findByUsername(bankerInput.getUsername());
    }

}
