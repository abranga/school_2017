/**
 * Created by abran on 08.11.2016.
 */
public abstract class Numbers
{
    public int a;
    public int b;

    public Numbers()
    {
        a=b=0;
    }

    public abstract void getA();
    public abstract void getB();
    public abstract void setA(int x);
    public abstract  void setB(int x);
    public abstract  void getSum();

}
