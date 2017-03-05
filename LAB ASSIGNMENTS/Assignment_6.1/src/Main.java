import java.math.BigInteger;
import java.util.*;
import java.math.*;

public class Main {

    public static BigInteger fact(int n)
    {
        BigInteger m= new BigInteger("1");
        BigInteger aux = new BigInteger("1");
        int i;
        for (i=1; i<=n; i++)
        {
            aux=BigInteger.valueOf(i);
            m = m.multiply(aux);
        }
        return m;
    }
    public static BigInteger comb(int n, int r)
    {
        BigInteger c = new BigInteger("0");
        BigInteger aux1= fact(r);
        BigInteger aux2= fact(n-r);
        BigInteger aux3= aux1.multiply(aux2);
        BigInteger aux4= fact(n);
        c = aux4.divide(aux3);
        return c;
    }
    public static void main(String[] args)
    {
        System.out.println(comb(49,6));
        System.out.println(comb(40,5));
    }
}
