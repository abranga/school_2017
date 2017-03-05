/**
 * Created by abran on 06.12.2016.
 */
public class MyException extends  Exception
{
    private String msg;
    public MyException(){};
    public MyException(String msg)
    {
        this.msg=msg;
    }

    public String getMsg()
    {
        return msg;
    }
}
