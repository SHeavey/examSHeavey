package ie.gmit;
//Shane Heavey
//EmployeeTest class is testing each of the expressions created in the Employee java class
//g00325970@gmit.ie
//09/03/2020

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee employee;

    @BeforeAll
    public static void initialise(){
        System.out.println("Test beginning");
    }

    @BeforeEach
    public void config(){
        employee = new Employee(" "," "," "," "," ",0);
    }

    @Test
    public void testTitleSuccess(){
        employee.setTitle("Mr");
        assertEquals("Mr", employee.getTitle());

        employee.setTitle("Mrs");
        assertEquals("Mrs", employee.getTitle());

        employee.setTitle("Ms");
        assertEquals("Ms", employee.getTitle());
    }

    @Test
    public void testTitleFail(){
/*
        assertThrows(IllegalArgumentException.class, () -> new
                Employee("Madam","Shane Heavey","52092G","1234567","Full-time",23));
        */
        IllegalArgumentException exe = assertThrows(IllegalArgumentException.class, () -> {
            employee.setTitle("Madam");
                });
        assertEquals("The title you entered is invalid",exe.getMessage());


    }


    @Test
    public void testNameSuccess(){
        employee.setName("Shane Heavey");
        assertEquals("Shane Heavey", employee.getName());
    }

    @Test
    public void testNameFail(){
        IllegalArgumentException exe = assertThrows(IllegalArgumentException.class, () -> {
            employee.setName("x");
        });
        assertEquals("The name entered is either too long or too short",exe.getMessage());
    }

    @Test
    public void testPpsSuccess(){
        employee.setPps("52092G");
        assertEquals("52092G", employee.getPps());
    }

    @Test
    public void testPpsFail(){
        IllegalArgumentException exe = assertThrows(IllegalArgumentException.class, () -> {
            employee.setPps("shane");
        });
        assertEquals("Invalid characters entered in for PPS Number",exe.getMessage());
    }

    @Test
    public void testPhoneSuccess(){
        employee.setPhone("1234567");
        assertEquals("1234567", employee.getPhone());
    }

    @Test
    public void testPhoneFail(){
        IllegalArgumentException exe = assertThrows(IllegalArgumentException.class, () -> {
            employee.setPhone("1212");
        });
        assertEquals("Invalid phone number",exe.getMessage());
    }

    @Test
    public void testEmploymentStatusSuccess(){
        employee.setEmploymentStatus("Full-time");
        assertEquals("Full-time", employee.getEmploymentStatus());
    }

    @Test
    public void testEmploymentStatusFail(){
        IllegalArgumentException exe = assertThrows(IllegalArgumentException.class, () -> {
            employee.setEmploymentStatus("On the dole");
        });
        assertEquals("Employment status incorrect",exe.getMessage());
    }

    @Test
    public void testAgeSuccess(){
        employee.setAge(23);
        assertEquals(23, employee.getAge());
    }

    @Test
    public void testAgeFail(){
        IllegalArgumentException exe = assertThrows(IllegalArgumentException.class, () -> {
            employee.setAge(17);
        });
        assertEquals("You are too young!",exe.getMessage());
    }



}
