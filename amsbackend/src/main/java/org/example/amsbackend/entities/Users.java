package org.example.amsbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userId;

    String name;
    Date dateOfBirth;
    int pan;
    String citizenUniqueID;
    String zipCode;
    String email;

    public Users() {
    }

    public Users(int userId, String name, Date dateOfBirth, int pan, String citizenUniqueID, String zipCode, String email) {
        this.userId = userId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.pan = pan;
        this.citizenUniqueID = citizenUniqueID;
        this.zipCode = zipCode;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public String getCitizenUniqueID() {
        return citizenUniqueID;
    }

    public void setCitizenUniqueID(String citizenUniqueID) {
        this.citizenUniqueID = citizenUniqueID;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
