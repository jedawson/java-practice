package org.example.amsbackend.respositories;

import org.example.amsbackend.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {
    List<Accounts> findAllByPan(Integer pan);
}
