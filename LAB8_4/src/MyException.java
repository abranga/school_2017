/**
 * Created by abran on 06.12.2016.
 */
public class MyException extends Exception
{
    String msg= new String("Exception message: ");
    public  MyException(){};
    public MyException(String msg)
    {
        super(msg);
        this.msg+=msg;
    }
    public void getMsg()
    {
        System.out.println(msg);
    }
}
