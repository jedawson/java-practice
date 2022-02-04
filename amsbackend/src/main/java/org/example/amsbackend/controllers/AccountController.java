package org.example.amsbackend.controllers;

import org.example.amsbackend.entities.Accounts;
import org.example.amsbackend.services.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AccountController {

    private AccountService accountService;
    public AccountController(AccountService accountService) { this.accountService = accountService;}

    @CrossOrigin(origins = "*")
    @PostMapping("/accounts/all")
    public List<Accounts> getAllByClientId(Integer clientId) {return this.accountService.findAllByClientId(clientId);}
}
