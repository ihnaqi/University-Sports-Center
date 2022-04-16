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
public class TimeTableTest {
    
    public TimeTableTest() {
    }

    /**
     * Test of getLessonDate method, of class TimeTable.
     */
    @Test
    public void testGetLessonDate() {
        System.out.println("getLessonDate");
        TimeTable instance = new TimeTable();
        LocalDate expResult = null;
        LocalDate result = instance.getLessonDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLessonDate method, of class TimeTable.
     */
    @Test
    public void testSetLessonDate() {
        System.out.println("setLessonDate");
        LocalDate _lessonDate = null;
        TimeTable instance = new TimeTable();
        instance.setLessonDate(_lessonDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeSlot method, of class TimeTable.
     */
    @Test
    public void testGetTimeSlot() {
        System.out.println("getTimeSlot");
        TimeTable instance = new TimeTable();
        String expResult = "";
        String result = instance.getTimeSlot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeSlot method, of class TimeTable.
     */
    @Test
    public void testSetTimeSlot() {
        System.out.println("setTimeSlot");
        String _timeSlot = "";
        TimeTable instance = new TimeTable();
        instance.setTimeSlot(_timeSlot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLesson method, of class TimeTable.
     */
    @Test
    public void testAddLesson() {
        System.out.println("addLesson");
        Lesson newLesson = null;
        TimeTable instance = new TimeTable();
        instance.addLesson(newLesson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TimeTable.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TimeTable instance = new TimeTable();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
