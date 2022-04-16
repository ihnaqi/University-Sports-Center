package usc;

import java.time.LocalDate;
import java.util.ArrayList;

public class TimeTable {
    private LocalDate _lessonDate;
    private String _timeSlot;
    private ArrayList<Lesson> _lesson;

    public TimeTable(){
       this._lesson = new ArrayList<>(); 
    }

    public TimeTable(LocalDate _lessonDate, String _timeSlot) {
        this._lessonDate = _lessonDate;
        this._timeSlot = _timeSlot;
        this._lesson = new ArrayList<Lesson>();
    }

    public LocalDate getLessonDate() {
        return _lessonDate;
    }

    public void setLessonDate(LocalDate _lessonDate) {
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
                System.err.println("Due to clashes this lesson cannot be added!");
                return;
            }
        }
        _lesson.add(newLesson);
    }

    @Override
    public String toString() {
        return "TimeTable{" + "_lesson=" + _lesson.toString() + '}';
    }
    
    
}
