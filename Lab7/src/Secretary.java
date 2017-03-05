import java.util.ArrayList;

/**
 * Created by abran on 22.11.2016.
 */
public class Secretary extends Employee implements SecretaryInterface
{
    public Secretary()
    {
        super();
    }

    public Secretary(String name,String address,boolean atWork)
    {
        super(name,address,atWork);
    }

    @Override
    public void createReport() {
        System.out.println("Secretary "+ getName() + " delivered report!");
    }

    @Override
    public void sendNews(String news) {
        System.out.println("Secretary "+ getName() + " sends following news: " +news);

    }

    @Override
    public void registerStudent(ArrayList<Student> studentList, Student student) {
        studentList.add(student);

    }

    @Override
    public void viewClasses() {
        System.out.println("Secretary has no classes!");

    }
}
