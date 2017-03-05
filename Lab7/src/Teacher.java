import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by abran on 22.11.2016.
 */
public class Teacher extends Employee implements TeacherInterface
{
    public Teacher()
    {
        super();
    }

    public Teacher(String name,String address,boolean atWork)
    {
        super(name,address,atWork);
    }

    @Override
    public void assignMark(ArrayList<Student> list,Student student, double mark) {
        for (Student s:list
             ) {
            if (s.equals(student))
            {
                student.insertMark(mark);
                break;
            }

        }

    }

    @Override
    public double getAverage(ArrayList<Student> list,Student student) {


        for (Student s:list
             ) {
            if (s.equals(student))
            {
                return s.getAvg();
            }

        }
        System.out.println("Student doesn't exist!");
        return 0;
    }

    @Override
    public void viewClasses() {

    }
}

