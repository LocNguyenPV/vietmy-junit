/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teaching.vietmy;

/**
 *
 * @author npvlo
 */
public class Student {
    private String name;
    private int age;
    private String className;
    private String id;

    public Student(){
    }
    public Student(String name, int age, String className, String id) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

     public boolean validateId() {
        return this.id != null && this.id.matches("vm-\\d{4}");
    }

    public boolean validateName() {
        return this.name != null && !this.name.trim().isEmpty();
    }

    public boolean validateClassName() {
        return this.className != null && !this.className.trim().isEmpty();
    }

    public boolean validateAge() {
        return this.age >= 18 && this.age <= 100;
    }
    
    
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", className=" + className + ", id=" + id + '}';
    }
}
