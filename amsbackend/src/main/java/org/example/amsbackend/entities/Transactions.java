package org.example.amsbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int transactionRefNum;
    int pan;
    Date time;
    String debitOrCredit;
    String cashOrTransfer;
    double balance;

    public Transactions() {
    }

    public Transactions(int id, int transactionRefNum, int pan, String debitOrCredit, String cashOrTransfer, double balance) {
        this.id = id;
        this.transactionRefNum = transactionRefNum;
        this.pan = pan;
        this.time = new Date();
        this.debitOrCredit = debitOrCredit;
        this.cashOrTransfer = cashOrTransfer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransactionRefNum() {
        return transactionRefNum;
    }

    public void setTransactionRefNum(int transactionRefNum) {
        this.transactionRefNum = transactionRefNum;
    }

    public int getPan() { return pan; }

    public void setPan(int pan) { this.pan = pan; }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDebitOrCredit() {
        return debitOrCredit;
    }

    public void setDebitOrCredit(String debitOrCredit) {
        this.debitOrCredit = debitOrCredit;
    }

    public String getCashOrTransfer() {
        return cashOrTransfer;
    }

    public void setCashOrTransfer(String cashOrTransfer) {
        this.cashOrTransfer = cashOrTransfer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
