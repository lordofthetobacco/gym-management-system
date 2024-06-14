import java.util.ArrayList;
import java.util.Date;

public class TrainingRoom {

    private ArrayList<Course> courses = new ArrayList<Course>();

    public TrainingRoom() {

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course[] getCourses() {
        return courses.toArray(new Course[courses.size()]);
    }
}
