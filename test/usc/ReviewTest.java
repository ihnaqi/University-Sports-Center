/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usc;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

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
        LocalDate date = LocalDate.of(2022, 02, 03);
        Lesson lesson = new Lesson("Music", date, "Morning", 1250.52);
        Student student00 = new Student("THED1982", "Mary");
        // student00.giveReview(1);
        Review instance = new Review(student00, lesson, 4);
        int expResult = 4;
        int result = instance.getRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRating method, of class Review.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        LocalDate date = LocalDate.of(2022, 02, 03);
        Lesson lesson = new Lesson("Music", date, "Morning", 1250.52);
        Student student00 = new Student("THED1982", "Mary");
        Review instance = new Review(student00, lesson, 4);
        instance.setRating(1);
        int expResult = 1;
        int result = instance.getRating();
        assertEquals(expResult, result);
        int _rating = 4;
        instance.setRating(_rating);
        assertEquals(4, instance.getRating());
    }

    /**
     * Test of getStudent method, of class Review.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        LocalDate date = LocalDate.of(2022, 02, 03);
        Lesson lesson = new Lesson("Music", date, "Morning", 1250.52);
        Student student00 = new Student("THED1982", "Mary");
        Review instance = new Review(student00, lesson, 4);
        Student expResult = student00;
        Student result = instance.getStudent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudent method, of class Review.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        LocalDate date = LocalDate.of(2022, 02, 03);
        Lesson lesson = new Lesson("Music", date, "Morning", 1250.52);
        Student student00 = new Student("THED1982", "Mary");
        Review instance = new Review(student00, lesson, 4);
        Student expResult = student00;
        Student result = instance.getStudent();
        assertEquals(expResult, result);
        Student _student = new Student("EDFKJ343", "Martha");
        instance.setStudent(_student);
        expResult = instance.getStudent();
        assertEquals(_student, expResult);
    }

    /**
     * Test of getLesson method, of class Review.
     */
    @Test
    public void testGetLesson() {
        System.out.println("getLesson");
        LocalDate date = LocalDate.of(2022, 02, 03);
        Lesson lesson = new Lesson("Music", date, "Morning", 1250.52);
        Student student00 = new Student("THED1982", "Mary");
        Review instance = new Review(student00, lesson, 4);
        Lesson expResult = lesson;
        Lesson result = instance.getLesson();
        assertEquals(expResult, result);
        assertEquals(expResult, result);
    }

    /**
     * Test of setLesson method, of class Review.
     */
    @Test
    public void testSetLesson() {
        System.out.println("setLesson");
        LocalDate date = LocalDate.of(2022, 02, 03);
        Lesson lesson = new Lesson("Music", date, "Morning", 1250.52);
        Student student00 = new Student("THED1982", "Mary");
        Review instance = new Review(student00, lesson, 4);
        Lesson expResult = lesson;
        Lesson result = instance.getLesson();
        assertEquals(expResult, result);
        assertEquals(expResult, result);
        Lesson _lesson = new Lesson("Dance", date, "Morning", 1250.52);
        instance.setLesson(_lesson);
        assertEquals(_lesson, instance.getLesson());
    }
    
}
