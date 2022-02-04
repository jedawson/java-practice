package org.example.amsbackend.respositories;

import org.example.amsbackend.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Clients, Integer> {
    Clients findByUsername(String username);
}
