/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.teaching.vietmy;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 *
 * @author npvlo
 */
public class ManageTest {
    private Manage students;
    public ManageTest() {
        students = new Manage();
    }

    @Test
    @DisplayName("Should create a student")
    @DisabledOnOs(value = OS.MAC)
    public void testAdd() {
        students.add("John", "Test", 18, "VM-1234");
        assertFalse(students.getAll().isEmpty());
        assertEquals(1, students.getAll().size());
    }
    
    @Test
    @DisabledOnOs(value = OS.MAC)
    @RepeatedTest(value = 5,
                name = "Repeating Test {currentRepetition} of {totalRepetitions}")
    public void testAddOnDev() {
     //   Assumptions.assumeFalse(students.getAll().isEmpty());
        students.add("John", "Test", 18, "VM-1234");
        assertFalse(students.getAll().isEmpty());
        assertEquals(1, students.getAll().size());
    }
    
    @Test
    @EnabledOnOs(value = OS.MAC)
    public void shouldThrowErrorWhenNameInvalid(){
        assertThrows(RuntimeException.class, () -> {
            students.add(null, "Test", 18, "VM-1234");
        });
    }

    @Test
    public void testTimeOut() {
        assertTimeout(Duration.ofSeconds(2), () -> {
    Thread.sleep(1000);
});

    }
    @Test
    public void testRemove() {
    }

    @Test
    public void testGetAll() {
    }

    @Test
    public void testGetById() {
    }

    @Test
    public void testUpdate() {
    }
    
}
