import java.util.ArrayList;
import java.util.UUID;

public class Utility {

    public static void main(String[] args) {
        ArrayList<Student> studentList = null;


        Teacher t1=new Teacher("Ioana","Address",false);
        Teacher t2=new Teacher("Maria","Address",false);
        Teacher t3=new Teacher("John","Address",false);

        Secretary s1=new Secretary("Adina","Address",false);



        s1.registerStudent(studentList,new Student("Andrei"));
        s1.registerStudent(studentList,new Student("Ion"));
        s1.registerStudent(studentList,new Student("Ion"));
        s1.registerStudent(studentList,new Student("Marius"));
        s1.registerStudent(studentList,new Student("Roxana"));




        t1.assignMark(studentList,studentList.get(1),6.4);
        t1.assignMark(studentList,studentList.get(1),4.4);
        t1.assignMark(studentList,studentList.get(1),10.0);
        t1.assignMark(studentList,studentList.get(1),9.5);
        t1.assignMark(studentList,studentList.get(1),7.6);
        t1.assignMark(studentList,studentList.get(1),3.1);

        System.out.println(studentList.get(1).getAvg());

       UUID uid=UniqueID.getID();
        System.out.println(uid);


    }
}
