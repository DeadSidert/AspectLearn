package com.nik.up.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class TypicalUser implements User {

    private String name = "Usually";
    private int age = 20;
    private String role;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }


    public TypicalUser() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }

    public int userWelcome(){
        System.out.println("Hello, i`m " + name);
        return age;
    }
}
