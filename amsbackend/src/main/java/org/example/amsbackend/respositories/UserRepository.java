package org.example.amsbackend.respositories;

import org.example.amsbackend.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByUserId(Integer integer);
    Users findByPan(String pan);
}
