package usc;

import java.util.Date;
import java.util.ArrayList;

public class TimeTable {
    private Date _lessonDate;
    private String _timeSlot;
    private ArrayList<Lesson> _lesson;

    public TimeTable(Date _lessonDate, String _timeSlot) {
        this._lessonDate = _lessonDate;
        this._timeSlot = _timeSlot;
        this._lesson = new ArrayList<Lesson>();
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
    
    public void addLesson(Lesson newLesson){
        // The new lesson being added must not have date field and time slot same as any of the already added lessons.
        for(int i = 0; i < _lesson.size(); i ++){
            if(_lesson.get(i).getLessonDate().compareTo(newLesson.getLessonDate()) == 0 && _lesson.get(i).getTimeSlot().compareTo(newLesson.getTimeSlot()) == 0 ){
                _lesson.add(newLesson);
            }
            else{
                System.err.println("Due to clashes this lesson cannot be added!");
            }
        }
    }

    @Override
    public String toString() {
        return "TimeTable{" + "_lessonDate=" + _lessonDate + ", _timeSlot=" + _timeSlot + ", _lesson=" + _lesson.toString() + '}';
    }
    
    
}
