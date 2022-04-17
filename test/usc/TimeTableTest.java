/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.time.LocalDate;
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
        LocalDate expResult = LocalDate.of(2022, 04, 12);
        Lesson lesson = new Lesson("Yoga", expResult, "Evening", 1260.30);
        TimeTable instance = new TimeTable(expResult, "Evening");
        instance.addLesson(lesson);
        
        LocalDate result = instance.getLessonDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLessonDate method, of class TimeTable.
     */
    @Test
    public void testSetLessonDate() {
        System.out.println("setLessonDate");
        LocalDate expResult = LocalDate.of(2022, 04, 12);
        TimeTable instance = new TimeTable(expResult, "Morning");
        LocalDate result = instance.getLessonDate();
        LocalDate _lessonDate = LocalDate.of(2022, 04, 06);
        Lesson lesson = new Lesson("Yoga", expResult, "Morning", 1652);
        instance.addLesson(lesson);
        instance.setLessonDate(_lessonDate);
        assertEquals(expResult, result);
    }
    /**
     * Test of getTimeSlot method, of class TimeTable.
     */
    @Test
    public void testGetTimeSlot() {
        System.out.println("getTimeSlot");
        LocalDate date = LocalDate.of(2022, 04, 12);
        TimeTable instance = new TimeTable(date, "Afternoon");
        Lesson lesson = new Lesson("Music", date, "Afternoon", 540.20);
        instance.addLesson(lesson);
        String expResult = "Afternoon";
        String result = instance.getTimeSlot();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimeSlot method, of class TimeTable.
     */
    @Test
    public void testSetTimeSlot() {
        System.out.println("setTimeSlot");
        LocalDate date = LocalDate.of(2022, 04, 16);
        String _timeSlot = "Evening";
        TimeTable instance = new TimeTable(date, "Afternoon");
        instance.setTimeSlot(_timeSlot);
        String expResult = "Evening";
        String result = instance.getTimeSlot();
        assertEquals(expResult, result);
    }
    
}
