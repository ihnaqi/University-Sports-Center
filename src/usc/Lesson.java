package usc;

import java.util.Date;

public class Lesson {
    private String _lessonName;
    private Date _lessonDate;
    private int _enrolledMembers;
    private String _timeSlot;
    private double _lessonFee;

    public Lesson(String _lessonName, Date _lessonDate, int _enrolledMembers, String _timeSlot, double _lessonFee) {
        this._lessonName = _lessonName;
        this._lessonDate = _lessonDate;
        this._enrolledMembers = _enrolledMembers;
        this._timeSlot = _timeSlot;
        this._lessonFee = _lessonFee;
    }

    public String getLessonName() {
        return _lessonName;
    }

    public void setLessonName(String _lessonName) {
        this._lessonName = _lessonName;
    }

    public Date getLessonDate() {
        return _lessonDate;
    }

    public void setLessonDate(Date _lessonDate) {
        this._lessonDate = _lessonDate;
    }

    public int getEnrolledMembers() {
        return _enrolledMembers;
    }

    public void setEnrolledMembers(int _enrolledMembers) {
        this._enrolledMembers = _enrolledMembers;
    }

    public String getTimeSlot() {
        return _timeSlot;
    }

    public void setTimeSlot(String _timeSlot) {
        this._timeSlot = _timeSlot;
    }

    public double getLessonFee() {
        return _lessonFee;
    }

    public void setLessonFee(double _lessonFee) {
        this._lessonFee = _lessonFee;
    }
    
    
}
