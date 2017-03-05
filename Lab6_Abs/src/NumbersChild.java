/**
 * Created by abran on 08.11.2016.
 */


public class  NumbersChild extends Numbers {

    public NumbersChild()
    {
        super();
    }
    public void getA()
    {
        System.out.println(">> "+ a);
    }
    public  void getB()
    {
        System.out.println(">> " + b);
    }
    public void setA(int x)
    {
        a=x;
    }
    public void setB(int x)
    {
        b=x;
    }
    public   void getSum()
    {
        System.out.println("Sum>> "+ (a+b));
    }

}
