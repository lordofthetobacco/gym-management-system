import java.util.Date;

public class Course {

    private String courseName;
    private Date startOfCourses;
    private Date endOfCourses;
    private Employee supervisor;

    public Course(String courseName, Date startOfCourses, Date endOfCourses, Employee supervisor) {
        this.courseName = courseName;
        this.startOfCourses = startOfCourses;
        this.endOfCourses = endOfCourses;
        this.supervisor = supervisor;
    }
    public String getCourseName() {
        return courseName;
    }

}
