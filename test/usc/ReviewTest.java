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
public class ReviewTest {
    
    public ReviewTest() {
    }

    /**
     * Test of getRating method, of class Review.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Review instance = null;
        int expResult = 0;
        int result = instance.getRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class Review.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        int _rating = 0;
        Review instance = null;
        instance.setRating(_rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class Review.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Review instance = null;
        Student expResult = null;
        Student result = instance.getStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudent method, of class Review.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        Student _student = null;
        Review instance = null;
        instance.setStudent(_student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLesson method, of class Review.
     */
    @Test
    public void testGetLesson() {
        System.out.println("getLesson");
        Review instance = null;
        Lesson expResult = null;
        Lesson result = instance.getLesson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLesson method, of class Review.
     */
    @Test
    public void testSetLesson() {
        System.out.println("setLesson");
        Lesson _lesson = null;
        Review instance = null;
        instance.setLesson(_lesson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Review.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Review instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
