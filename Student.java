package com.company;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private static int ID = 0;
    private Integer id = 0;
    private String name;
    private Integer age;
    private String phone;

    public Student(){};
    public Student(String name, String phone, Integer age){
        setAll(name, phone, age);
    };

    public void setAll(String name, String phone, Integer age){
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.id = ID;
        ID++;
    }

    public String getAll(){
        String info = "(id " + id + ") " + name + "; " + age + " years old; " + phone;
        return info;
    }

    public String getName(){
        return name;
    }
    public Integer getID(){
        return id;
    }
}
