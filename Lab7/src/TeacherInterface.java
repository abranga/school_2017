import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by abran on 22.11.2016.
 */
public interface TeacherInterface {
    public void assignMark(ArrayList<Student> list,Student student,double mark);
    public double getAverage(ArrayList<Student> list,Student student);
}
