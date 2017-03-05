/**
 * Created by abran on 18.10.2016.
 */
import java.util.*;
import java.math.*;

public class Extraction
{

    private int numbers[] = new int[6];
    private int type;


    public Extraction()
    {
        for(int i=0; i<6; i++)
        {
            numbers[i]=0;
        }
        type = 6;
    }
    public Extraction(int x)
    {
        if (x!=6 || x!=5)
        {
            type=6;
        }
        else
        {
            type = 6;
        }
        for(int i=0; i<6; i++)
        {
            numbers[i]=0;
        }
    }

    public void generate()
    {
        int ct=0;
        while (ct<type)
        {
            int a =  1 + (int)(Math.random() * 49);
            if(a<=49)
            {
                numbers[ct]=a;
                ct++;
            }
        }
    }

    public void printNumbers()
    {
        System.out.print("Extracted numbers are: ");
        for(int i=0; i<type; i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }

}
