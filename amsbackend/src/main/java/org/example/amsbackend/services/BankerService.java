package org.example.amsbackend.services;

import org.example.amsbackend.entities.Bankers;
import org.example.amsbackend.respositories.BankerRepository;
import org.springframework.stereotype.Service;

@Service
public class BankerService {
    private BankerRepository bankerRepository;
    public BankerService(BankerRepository bankerRepository) {this.bankerRepository = bankerRepository;}
    public Bankers findByUsername(String username) {return this.bankerRepository.findByUsername(username);}

}
