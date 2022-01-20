package org.example.app;

import org.example.beans.Employee;
import org.example.controller.SaverController;
import org.example.service.DbSaverService;
import org.example.service.Saver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOne {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "first", "last");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SaverController controller = context.getBean(SaverController.class);
        controller.save(employee);

    }
}
