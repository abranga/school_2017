package Lab7;

/**
 * Created by abran on 22.11.2016.
 */
public class Arithmetic implements Arithmetic_I
{
    double a,b;

    @Override
    public double getSum(double a, double b) {
        return a+b;
    }

    @Override
    public double getProd(double a, double b) {
        return a*b;
    }

    @Override
    public double getDiv(double a, double b) {
        return a/b;
    }

    @Override
    public double getMod(double a, double b) {
        return a%b;
    }

    @Override
    public double getSubt(double a, double b) {
        return a-b;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public void setA(double a)
    {
        this.a=a;
    }

    public void setB(double b)
    {
        this.b=b;
    }
}
