package org.example.controller;

import org.example.beans.Employee;
import org.example.service.Saver;

public class SaverController implements Saver{
    Saver saver;

    public SaverController() {
    }

    public Saver getSaver() {
        return saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }

    public SaverController(Saver saver) {
        this.saver = saver;
    }

    @Override
    public void save(Employee employee) {

    }
}
