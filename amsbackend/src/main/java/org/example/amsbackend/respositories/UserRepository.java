package org.example.amsbackend.respositories;

import org.example.amsbackend.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByUserId(Integer integer);
    Users findByPan(String pan);
}
