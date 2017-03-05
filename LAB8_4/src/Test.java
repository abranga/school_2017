/**
 * Created by abran on 06.12.2016.
 */
public class Test {
    public Test() {
    }



    public static void f() throws MyException
    {
        try {
            g();
        }
        catch (MyException e)
        {
            throw new MyException("New Exception!");
        }
    }

    public static void g() throws MyException {
        throw new MyException ("Andrei");
    }
}
