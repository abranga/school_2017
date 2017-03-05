import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by abran on 22.11.2016.
 */
public class Student implements StudentInterface
{
    private String name;
    private final UUID studentID;
    private ArrayList<Mark> marks;

    public Student()
    {
        this.studentID=UniqueID.getID();
        this.name="DEFAULT";
    }

    public Student(String name)
    {
        this.studentID=UniqueID.getID();
        this.name=name;
    }

    public UUID getId()
    {
        return studentID;
    }

    @Override
    public void deliverProject() {
        System.out.println("Student:"+ name + " delivered project!");

    }

    @Override
    public void viewMarks() {
        System.out.print("Student "+name+" marks are: ");
        for (Mark m:marks
             ) {
            System.out.print(" "+m.mark);
        }
        System.out.println();
    }

    public boolean equals(Object obj)
    {
        Student s=(Student)obj;
        if (s.getId()==getId())
        {
            return true;
        }
        else
        {
            return  false;
        }
    }

    public void insertMark(double mark)
    {
        Mark m=new Mark(mark);
        marks.add(m);
    }

    public double getAvg()
    {
        double avg=0;

        for (Mark m:marks
             ) {avg+=m.mark;

        }
        return avg/marks.size();
    }
}
