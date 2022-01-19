package com.javapractice.jan11.service;

import com.javapractice.jan11.beans.ProcessedStudent;
import com.javapractice.jan11.beans.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProcessService {
    public void process(){
        try {
            FileInputStream fileInputStream = new FileInputStream("src/com/javapractice/jan11/input.dat");
            FileOutputStream fileOutputStream = new FileOutputStream("src/com/javapractice/jan11/output.dat");
            int numberOfBytes = fileInputStream.available();
            byte[] data = new byte[numberOfBytes];
            fileInputStream.read(data);
            String csv = new String(data);
            String[] studentCSV = csv.split("\n");
            for(String line: studentCSV) {
                Student student = Student.parseStudent(line);
                int total = student.getSub1() + student.getSub2() + student.getSub3();
                double average = (double)total / 3;
                ProcessedStudent processedStudent = new ProcessedStudent();
                processedStudent.setId(student.getId());
                processedStudent.setName(student.getName());
                processedStudent.setSub1(student.getSub1());
                processedStudent.setSub2(student.getSub2());
                processedStudent.setSub3(student.getSub3());
                processedStudent.setTotal(total);
                processedStudent.setAverage(average);
                fileOutputStream.write((processedStudent.toCSV()+"\n").getBytes());
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
