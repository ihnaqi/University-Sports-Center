/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class LessonTest {
    
    public LessonTest() {
    }

    /**
     * Test of getLessonName method, of class Lesson.
     */
    @Test
    public void testGetLessonName() {
        System.out.println("getLessonName");
        LocalDate date = LocalDate.of(2021, 04, 21);
        Lesson instance = new Lesson("Karate", date, "Evening", 250.5);
        String expResult = "Karate";
        String result = instance.getLessonName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLessonName method, of class Lesson.
     */
    @Test
    public void testSetLessonName() {
        System.out.println("setLessonName");
        LocalDate date = LocalDate.of(2021, 04, 21);
        Lesson instance = new Lesson("Karate", date, "Evening", 250.5);
        String expResult = "Karate";
        instance.setLessonName("Yoga");
        String updatedExpResult = "Yoga";
        String result = instance.getLessonName();
        assertNotEquals(expResult, result);
        assertEquals(updatedExpResult, result);
    }

    /**
     * Test of getLessonDate method, of class Lesson.
     */
    @Test
    public void testGetLessonDate() {
        System.out.println("getLessonDate");
        LocalDate date = LocalDate.of(2021, 04, 21);
        Lesson instance = new Lesson("Karate", date, "Evening", 250.5);
        instance.setLessonDate(LocalDate.of(2021, 04, 05));
        LocalDate expResult = LocalDate.of(2021, 04, 21);
        LocalDate result = instance.getLessonDate();
        assertNotEquals(expResult, result);
        assertEquals(LocalDate.of(2021, 04, 05), instance.getLessonDate());
    }

    /**
     * Test of setLessonDate method, of class Lesson.
     */
    @Test
    public void testSetLessonDate() {
        System.out.println("setLessonDate");
        LocalDate date = LocalDate.of(2021, 04, 21);
        Lesson instance = new Lesson("Karate", date, "Evening", 250.5);
        LocalDate expResult = LocalDate.of(2021, 04, 21);
        LocalDate result = instance.getLessonDate();
        assertEquals(expResult, result);
        LocalDate _lessonDate = LocalDate.of(2022, 02, 15);
        instance.setLessonDate(_lessonDate);
        result = instance.getLessonDate();
        assertNotEquals(expResult, result);
        assertEquals(result, LocalDate.of(2022, 02, 15));
        
    }

    /**
     * Test of getEnrolledMembers method, of class Lesson.
     */
    @Test
    public void testGetEnrolledMembers() {
        System.out.println("getEnrolledMembers");
        LocalDate date = LocalDate.of(2021, 12, 24);
        Lesson instance = new Lesson("Yoga", date, "Morning", 2460);
        Student student00 = new Student("BKJUND5324", "Michael");
        Student student01 = new Student("DEFEDFEEV24", "Michael");
        Student student02 = new Student("JDH34DFH98", "Michael");
        instance.registerMember(student00);
        instance.registerMember(student01);
        instance.registerMember(student02);
        int expResult = 3;
        int result = instance.getEnrolledMembers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeSlot method, of class Lesson.
     */
    @Test
    public void testGetTimeSlot() {
        System.out.println("getTimeSlot");
        LocalDate date = LocalDate.of(2021, 10, 14);
        Lesson instance = new Lesson("Yoga", date, "Morning", 2460);
        String expResult = "Morning";
        String result = instance.getTimeSlot();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimeSlot method, of class Lesson.
     */
    @Test
    public void testSetTimeSlot() {
        System.out.println("setTimeSlot");
        LocalDate date = LocalDate.of(2021, 10, 14);
        Lesson instance = new Lesson("Yoga", date, "Morning", 2460);
        String oldTiming = instance.getTimeSlot();
        String _timeSlot = "Evening";
        instance.setTimeSlot(_timeSlot);
        String result = instance.getTimeSlot();
        assertNotEquals(oldTiming, result);
        assertEquals(_timeSlot, result);
    }

    /**
     * Test of getLessonFee method, of class Lesson.
     */
    @Test
    public void testGetLessonFee() {
        System.out.println("getLessonFee");
        LocalDate date = LocalDate.of(2021, 10, 14);
        Lesson instance = new Lesson("Yoga", date, "Morning", 2460);
        double expResult = 2460.0;
        double result = instance.getLessonFee();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setLessonFee method, of class Lesson.
     */
    @Test
    public void testSetLessonFee() {
        System.out.println("setLessonFee");
        LocalDate date = LocalDate.of(2021, 10, 14);
        double _lessonFee = 3200.50;
        Lesson instance = new Lesson("Yoga", date, "Morning", 2460);
        instance.setLessonFee(_lessonFee);
        double result = instance.getLessonFee();
        assertNotEquals(2460, instance.getLessonFee(), 0.50);
        assertEquals(3200.50, result, 00);
    }

    /**
     * Test of registerMember method, of class Lesson.
     */
    @Test
    public void testRegisterMember() {
        System.out.println("registerMember");
        LocalDate date = LocalDate.of(2021, 10, 14);
        Student student00 = new Student("KDKJT334", "Karl");
        Student student01 = new Student("EDERU987", "Jonathan");
        Student student02 = new Student("LKIEF9078", "Smith");
        Student student03 = new Student("897KLJ", "Jordan");
        Lesson instance = new Lesson("Yoga", date, "Morning", 2460);
        assertEquals(0, instance.getEnrolledMembers());
        instance.registerMember(student00);
        assertEquals(1, instance.getEnrolledMembers());
        instance.registerMember(student01);
        assertEquals(2, instance.getEnrolledMembers());
        instance.registerMember(student02);
        assertEquals(3, instance.getEnrolledMembers());
        instance.registerMember(student03);
        assertEquals(4, instance.getEnrolledMembers());
        Student student04 = new Student("9834DF", "McKenzie");
        assertNotEquals(5, instance.getEnrolledMembers());
        assertEquals(4, instance.getEnrolledMembers());
        
    }
    
}
