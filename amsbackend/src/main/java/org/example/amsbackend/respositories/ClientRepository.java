package org.example.amsbackend.respositories;

import org.example.amsbackend.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Clients, Integer> {
    Clients findByUsername(String username);
}
