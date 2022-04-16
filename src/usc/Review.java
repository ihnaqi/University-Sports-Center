package usc;

public class Review {
    private Student _student;
    private Lesson _lesson;
    private int _rating;

    public Review(Student _student, Lesson _lesson, int _rating) {
        this._student = _student;
        this._lesson = _lesson;
        this._rating = _rating;
    }

    public int getRating() {
        return _rating;
    }

    public void setRating(int _rating) {
        this._rating = _rating;
    }

    public Student getStudent() {
        return _student;
    }

    public void setStudent(Student _student) {
        this._student = _student;
    }

    public Lesson getLesson() {
        return _lesson;
    }

    public void setLesson(Lesson _lesson) {
        this._lesson = _lesson;
    }
    
}
