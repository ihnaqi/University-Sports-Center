/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.time.LocalDate;
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
public class LessonTest {
    
    public LessonTest() {
    }

    /**
     * Test of getLessonName method, of class Lesson.
     */
    @Test
    public void testGetLessonName() {
        System.out.println("getLessonName");
        Lesson instance = null;
        String expResult = "";
        String result = instance.getLessonName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLessonName method, of class Lesson.
     */
    @Test
    public void testSetLessonName() {
        System.out.println("setLessonName");
        String _lessonName = "";
        Lesson instance = null;
        instance.setLessonName(_lessonName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLessonDate method, of class Lesson.
     */
    @Test
    public void testGetLessonDate() {
        System.out.println("getLessonDate");
        Lesson instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getLessonDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLessonDate method, of class Lesson.
     */
    @Test
    public void testSetLessonDate() {
        System.out.println("setLessonDate");
        LocalDate _lessonDate = null;
        Lesson instance = null;
        instance.setLessonDate(_lessonDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnrolledMembers method, of class Lesson.
     */
    @Test
    public void testGetEnrolledMembers() {
        System.out.println("getEnrolledMembers");
        Lesson instance = null;
        int expResult = 0;
        int result = instance.getEnrolledMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeSlot method, of class Lesson.
     */
    @Test
    public void testGetTimeSlot() {
        System.out.println("getTimeSlot");
        Lesson instance = null;
        String expResult = "";
        String result = instance.getTimeSlot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeSlot method, of class Lesson.
     */
    @Test
    public void testSetTimeSlot() {
        System.out.println("setTimeSlot");
        String _timeSlot = "";
        Lesson instance = null;
        instance.setTimeSlot(_timeSlot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLessonFee method, of class Lesson.
     */
    @Test
    public void testGetLessonFee() {
        System.out.println("getLessonFee");
        Lesson instance = null;
        double expResult = 0.0;
        double result = instance.getLessonFee();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLessonFee method, of class Lesson.
     */
    @Test
    public void testSetLessonFee() {
        System.out.println("setLessonFee");
        double _lessonFee = 0.0;
        Lesson instance = null;
        instance.setLessonFee(_lessonFee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerMember method, of class Lesson.
     */
    @Test
    public void testRegisterMember() {
        System.out.println("registerMember");
        Student student = null;
        Lesson instance = null;
        instance.registerMember(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lesson.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Lesson instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
