package com.Samundeeswari.Velusamy.Controller;

import com.Samundeeswari.Velusamy.Services.EmployeeDBServices;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeController {
public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();

    EmployeeDBServices employeeDBServices = new EmployeeDBServices();
//    employeeDBServices.addEmployee(factory,session);
//    employeeDBServices.findUser(factory,session,3);
//    employeeDBServices.updateEmployee(factory,session,4);
    employeeDBServices.deleteEmployee(session,2);
}}
