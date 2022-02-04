package org.example.amsbackend.services;

import org.example.amsbackend.entities.Clients;
import org.example.amsbackend.respositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository) {this.clientRepository = clientRepository;}
    public Clients findByUsername(String username) {return this.clientRepository.findByUsername(username);}

}
