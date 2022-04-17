/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hope
 */
public class StudentTest {
    
    public StudentTest() {
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student("BSF234", "Knuth");
        String expResult = "BSF234";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        String _studentID = "ASF19744";
        Student instance = new Student("BSF234", "Knuth");
        instance.setStudentID(_studentID);
        String expResult = "ASF19744";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        instance.setStudentID(_studentID);
    }

    /**
     * Test of getStudentName method, of class Student.
     */
    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        Student instance = new Student("BSF234", "Knuth");
        String expResult = "Knuth";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentName method, of class Student.
     */
    @Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String _studentName = "Vlar";
        Student instance = new Student("BSF234", "Knuth");
        instance.setStudentName("Vlar");
        String expResult = "Vlar";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        instance.setStudentName(_studentName);
    }

    /**
     * Test of giveReview method, of class Student.
     */
    @Test
    public void testGiveReview() {
        System.out.println("giveReview");
        int num = 3;
        Student instance = new Student("BSF234", "Knuth");
        instance.giveReview(num);
        String result = instance.getReview();
        assertEquals("OK", result);
    }

    /**
     * Test of getReview method, of class Student.
     */
    @Test
    public void testGetReview() {
        System.out.println("getReview");
        int num = 4;
        Student instance = new Student("BSF234", "Knuth");
        instance.giveReview(num);
        String result = instance.getReview();
        assertEquals("Satisfied", result);
    }
    
}
