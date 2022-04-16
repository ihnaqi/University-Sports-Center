package usc;

public class Student {
    private String _studentID;
    private String _studentName;
    private int _review;

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
    
    public void giveReview(int num){
        if(num > 5){
            this._review = 5;
        }
        else if(num < 1){
            this._review = 1;
        }
        else{
            this._review = num;
        }
    }
    
    public String getReview(){
        String str = "";
        switch(this._review){
            case 1:
                str = "Very Dissatisfied";
                break;
            case 2:
                str = "Dissatified";
                break;
            case 3:
                str = "OK";
                break;
            case 4:
                str = "Satisfied";
                break;
            case 5:
                str = "Very Satisfied";
                break;
        }
        
        return str;
    }
    
    @Override
    public String toString() {
        return "Student{" + "_studentID=" + _studentID + ", _studentName=" + _studentName + ", _studentReview=" + this.getReview() +  '}';
    }
    
    
}
