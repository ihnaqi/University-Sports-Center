package usc;

public class Student {
    private String _studentID;
    private String _studentName;

    public Student(String _studentID, String _studentName) {
        this._studentID = _studentID;
        this._studentName = _studentName;
    }

    public String getStudentID() {
        return _studentID;
    }

    public void setStudentID(String _studentID) {
        this._studentID = _studentID;
    }

    public String getStudentName() {
        return _studentName;
    }

    public void setStudentName(String _studentName) {
        this._studentName = _studentName;
    }
    
    
}
