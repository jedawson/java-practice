package org.example.amsbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int pan;
    double balance;

    public Accounts() {
    }

    public Accounts(int id, int pan, double balance) {
        this.id = id;
        this.pan = pan;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
