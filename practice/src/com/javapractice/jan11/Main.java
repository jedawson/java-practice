package com.javapractice.jan11;

import com.javapractice.jan11.beans.ProcessedStudent;
import com.javapractice.jan11.service.ProcessService;

public class Main {
    public static void main(String[] args) {
        ProcessService processStudent = new ProcessService();
        processStudent.process();
    }
}
