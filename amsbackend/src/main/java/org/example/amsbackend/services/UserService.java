package org.example.amsbackend.services;

import org.example.amsbackend.entities.Users;
import org.example.amsbackend.respositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}
    public Users findByUserId(Integer integer) {return this.userRepository.findByUserId(integer);}
    public Users findByPan(String pan) {return this.userRepository.findByPan(pan);}
}
