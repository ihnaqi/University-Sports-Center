package usc;

import java.util.Date;

public class TimeTable {
    private Date _lessonDate;
    private String _timeSlot;
    private Lesson _lesson;

    public TimeTable(Date _lessonDate, String _timeSlot, Lesson _lesson) {
        this._lessonDate = _lessonDate;
        this._timeSlot = _timeSlot;
        this._lesson = _lesson;
    }
    
    public TimeTable(Date _lessonDate, String _timeSlot) {
        this._lessonDate = _lessonDate;
        this._timeSlot = _timeSlot;
    }

    public Date getLessonDate() {
        return _lessonDate;
    }

    public void setLessonDate(Date _lessonDate) {
        this._lessonDate = _lessonDate;
    }

    public String getTimeSlot() {
        return _timeSlot;
    }

    public void setTimeSlot(String _timeSlot) {
        this._timeSlot = _timeSlot;
    }

    public Lesson getLesson() {
        return _lesson;
    }

    public void setLesson(Lesson _lesson) {
        this._lesson = _lesson;
    }
    
    
}
