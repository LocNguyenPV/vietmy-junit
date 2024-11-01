/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teaching.vietmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author npvlo
 */
public class Manage {
    private Map<String, Student> students;

    public Manage() {
        students = new ConcurrentHashMap<>();
    }
    
    public void add(String name, String className, int age, String id){
        Student student = new Student(name, age, className, id);
        validateObj(student);
        
    }
    
    private void validateObj(Student student){
        if(!student.validateAge()) throw new RuntimeException("Age must be between 18 and 100");
        if(!student.validateClassName()) throw new RuntimeException("Class can't be null");
        if(!student.validateId()) throw new RuntimeException("Id can't be null and format must be VM-xxxx (x is number)");
        if(!student.validateName()) throw new RuntimeException("Name can't be null");
    }
    
    private void checkIfDuplicate(String id){
        if(students.containsKey(id))
            throw new RuntimeException("Duplicate Id");
    }
    
    public void remove(){
        
    }
}
