import java.util.*;


public class Main {

    public static boolean isMultiple(int x)
    {
        if (x%3==0 || x%5==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        long s=0;
        int i;

        for (i=0; i<n; i++)
        {
           if (isMultiple(i))
            {
                s+=i;
            }
        }
        System.out.print("Sum is: "+ s);
    }
}
