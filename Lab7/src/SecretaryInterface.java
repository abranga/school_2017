import java.util.ArrayList;

/**
 * Created by abran on 22.11.2016.
 */
public interface SecretaryInterface {
    public void createReport();
    public void sendNews(String news);
    public void registerStudent(ArrayList<Student> studentList,Student student);
}
