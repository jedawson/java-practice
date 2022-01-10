package com.javapractice.jan7.service;

import com.javapractice.Employee;

public interface DataAccess {
    void save();
    Employee read();
    Employee update();
}
