package org.example.amsbackend.respositories;

import org.example.amsbackend.entities.Bankers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankerRepository extends JpaRepository<Bankers, Integer> {
    Bankers findByUsername(String username);
}
