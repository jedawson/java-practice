package com.javapractice.jan11.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessedStudent {
    int id;
    String name;
    int sub1;
    int sub2;
    int sub3;
    int total;
    double average;
    public String toCSV(){
        return id+", "+name+", "+sub1+", "+sub2+", "+sub3+", "+total+", "+average;
    }
    public static ProcessedStudent parseStudent(String csv) {
        String[] values = csv.split(",");
        int id = Integer.parseInt(values[0].trim());
        String name = values[1].trim();
        int sub1 = Integer.parseInt(values[2].trim());
        int sub2 = Integer.parseInt(values[3].trim());
        int sub3 = Integer.parseInt(values[4].trim());
        int total = Integer.parseInt(values[5].trim());
        double average = Double.parseDouble(values[6].trim());
        return new ProcessedStudent(id, name, sub1, sub2, sub3, total, average);
    }
}
