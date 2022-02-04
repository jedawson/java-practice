package org.example.amsbackend.services;

import org.example.amsbackend.entities.Accounts;
import org.example.amsbackend.respositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountRepository accountRepository;
    public AccountService(AccountRepository accountRepository) {this.accountRepository = accountRepository;}
    public List<Accounts> findAllByClientId(Integer clientId) {return this.accountRepository.findAllByClientId(clientId);}
}
