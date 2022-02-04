package org.example.amsbackend.controllers;

import org.example.amsbackend.entities.Clients;
import org.example.amsbackend.services.ClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private ClientService clientService;
    public ClientController(ClientService clientService) {this.clientService = clientService;}

    @CrossOrigin(origins = "*")
    @PostMapping("/clients")
    public Clients findClient(@RequestBody Clients clientInput) {
        return clientService.findByUsername(clientInput.getUsername());
    }

}
