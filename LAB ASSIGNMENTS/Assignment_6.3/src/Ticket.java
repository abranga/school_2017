/**
 * Created by abran on 18.10.2016.
 */
import java.util.*;

public class Ticket
{
    private int ticket[] = new int[6];
    private int type;

    public Ticket()
    {
        for(int i=0; i<6; i++)
        {
            ticket[i]=0;
        }
        type = 6;
    }
    public Ticket(int x)
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
            ticket[i]=0;
        }
    }
    private boolean isAlready(int x)
    {
        for (int i=0; i<type; i++)
        {
            if(ticket[i]==x)
            {
                return true;
            }
        }
        return false;
    }
    public void getNumbers()
    {
        int i=0;
        while (i<type)
        {
            int aux;
            System.out.print("Insert number " + (i+1) + " >>");
            Scanner in = new Scanner(System.in);
            aux=in.nextInt();
            if (!isAlready(aux))
            {
                ticket[i]=aux;
                i++;
            }
            else
            {
                System.out.println("Number already chosen!");
            }
            System.out.println();
        }
    }

    public void printTicket()
    {
        System.out.print("Your ticket is: ");
        int i;
        for (i=0; i<type; i++)
        {
            System.out.print(ticket[i]+ " ");
        }
        System.out.println();
    }
}
