import java.util.ArrayList;
public class Course {

    private String title;
    private Teacher instructor;
    private int hours;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String title, ArrayList<Student> enrolledStudents, Teacher instructor, int hours) {
        this.title = title;
        this.enrolledStudents = enrolledStudents;
        this.instructor = instructor;
        this.hours = hours;
    }

    public Course(String title, ArrayList<Student> enrolledStudents) {
        this("title", enrolledStudents, null, 0);
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String aTitle) {
        title = aTitle;
    }

    public int getHours(){
        return hours;
    }

    void setHours(int aHours){
        hours = aHours;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
