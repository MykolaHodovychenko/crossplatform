package com.example.mvc_demo2.model;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    @Size(min = 2, max = 50, message = "First name should be from 2 to 50 characters")
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 2, max= 50, message = "Last name should be from 2 to 50 characters")
    private String lastName;

    @Column(name = "patronymic")
    @Size(min = 2, max= 50, message = "Patronymic should be from 2 to 50 characters")
    private String patronymic;

    @Column(name = "email")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "email format is invalid")
    private String email;

    @Column(name = "phone")
    @Size(min = 8, max= 20, message = "Phone should be from 8 to 20 characters")
    private String phone;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String patronymic, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
