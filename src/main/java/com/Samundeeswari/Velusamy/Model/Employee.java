package com.Samundeeswari.Velusamy.Model;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Column(name="emp_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private String emp_surname;
    private int emp_age;
    private String emp_phone;
    private String emp_email;
    public Employee() {

    }

    public Employee(String emp_name, String emp_surname, int emp_age, String emp_phone, String emp_email) {
        this.emp_name = emp_name;
        this.emp_surname = emp_surname;
        this.emp_age = emp_age;
        this.emp_phone = emp_phone;
        this.emp_email = emp_email;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_surname() {
        return emp_surname;
    }

    public void setEmp_surname(String emp_surname) {
        this.emp_surname = emp_surname;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_surname='" + emp_surname + '\'' +
                ", emp_age=" + emp_age +
                ", emp_phone='" + emp_phone + '\'' +
                ", emp_email='" + emp_email + '\'' +
                '}';
    }
}
