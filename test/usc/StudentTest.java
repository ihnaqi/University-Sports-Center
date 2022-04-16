/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        String _studentID = "";
        Student instance = null;
        instance.setStudentID(_studentID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentName method, of class Student.
     */
    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentName method, of class Student.
     */
    @Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String _studentName = "";
        Student instance = null;
        instance.setStudentName(_studentName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveReview method, of class Student.
     */
    @Test
    public void testGiveReview() {
        System.out.println("giveReview");
        int num = 0;
        Student instance = null;
        instance.giveReview(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReview method, of class Student.
     */
    @Test
    public void testGetReview() {
        System.out.println("getReview");
        Student instance = null;
        String expResult = "";
        String result = instance.getReview();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
