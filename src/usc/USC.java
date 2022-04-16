
package usc;
import java.time.LocalDate;
public class USC {

    public static void main(String[] args) {
        // TODO code application logic here

        TimeTable tt = new TimeTable();
        
//        Date date = new Date
        LocalDate date = LocalDate.of(2021, 05, 25);
        Lesson les = new Lesson("Yoga", date, "Morning",500);
        Student std= new Student("DEDER5454", "Chris Jordan");
        les.registerMember(std);
        tt.addLesson(les);
        System.out.println( tt.toString());

    }
    
}
