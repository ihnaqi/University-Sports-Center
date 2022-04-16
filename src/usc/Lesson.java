package usc;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lesson {
    private String _lessonName;
    private LocalDate _lessonDate;
    private String _timeSlot;
    private double _lessonFee;
    private int _enrolledMembers;
    private Student [] _enrolledMembersList;
    private ArrayList<Review> reviewsList;

    public Lesson(String _lessonName, LocalDate _lessonDate, String _timeSlot, double _lessonFee) {
        this._lessonName = _lessonName;
        this._lessonDate = _lessonDate;
        this._timeSlot = _timeSlot;
        this._lessonFee = _lessonFee;
        this._enrolledMembers = 0;
        this._enrolledMembersList = new Student[4];
        this.reviewsList = new ArrayList();
    }

    public String getLessonName() {
        return _lessonName;
    }

    public void setLessonName(String _lessonName) {
        this._lessonName = _lessonName;
    }

    public LocalDate getLessonDate() {
        return _lessonDate;
    }
    
    public void setLessonDate(LocalDate _lessonDate) {
        this._lessonDate = _lessonDate;
    }

    public int getEnrolledMembers() {
        return _enrolledMembers;
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
    
    public void registerMember(Student student){
        if(this.getEnrolledMembers() < 4){
            this._enrolledMembersList[_enrolledMembers] = student;
            this._enrolledMembers ++;
        }
        else{
            System.out.println("No space for a new member");
        }
    }

    @Override
    public String toString() {
        String memList = _enrolledMembersList.toString();
        return "Lesson{" + "_lessonName=" + _lessonName + ", _lessonDate=" + _lessonDate + ", _timeSlot=" + _timeSlot + ", _lessonFee=" + _lessonFee + ", _enrolledMembers=" + _enrolledMembers + ", _enrolledMembersList=" + memList + '}';
    }

   
    
}
