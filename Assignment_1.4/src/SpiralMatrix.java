/**
 * Created by abran on 23.10.2016.
 * Class for spiral matrix management
 */
import java.util.*;

public class SpiralMatrix
{
    private static final int I_LENGTH=10000;
    private static final int J_LENGTH=10000;
    private int actualLength;
    private int[][] matrix=new int[I_LENGTH][J_LENGTH];
    private int[][] visited=new int[I_LENGTH][J_LENGTH];
    private int i,j;
    public SpiralMatrix()
    {
        actualLength=0;
        i=j=I_LENGTH-1;
    }

    public void printMatrix()
    {
        int i,j;
         for (i=I_LENGTH-actualLength; i<I_LENGTH; i++)
         {
             for (j=J_LENGTH-actualLength; j<J_LENGTH; j++)
             {
                 System.out.print(matrix[i][j]+ " ");
             }
             System.out.println();
         }
    }

    private void goLeft()
    {
        j--;
    }
    private void goRight()
    {
        j++;
    }
    private void goUp()
    {
        i--;
    }
    private void goDown()
    {
        i++;
    }
    private boolean right()
    {
        if (j<J_LENGTH-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private boolean left()
    {
        if (j>J_LENGTH-actualLength)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
    private boolean up()
    {
        if (i>I_LENGTH-actualLength)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private boolean down()
    {
        if (i<I_LENGTH-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private boolean notVisited(int a, int b)
    {
        if (visited[a][b]==0)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
    private void visit(int a,int b)
    {
        visited[a][b]=1;
    }

    public void fillMatrix(int length)
    {
        actualLength=length;
        int counter=length*length;
        int laps=length;
        for (int m=0; m<laps; m++)
        {
            while(left() && notVisited(i,j-1))
            {
                matrix[i][j]=counter;
                counter--;
                visit(i,j);
                goLeft();
            }
            while (up() && notVisited(i-1,j))
            {
                matrix[i][j]=counter;
                counter--;
                visit(i,j);
                goUp();
            }
            while (right() && notVisited(i,j+1))
            {
                matrix[i][j]=counter;
                counter--;
                visit(i,j);
                goRight();
            }
            while (down() && notVisited(i+1,j))
            {
                matrix[i][j] = counter;
                counter--;
                visit(i, j);
                goDown();
            }
        }
        matrix[i][j]=counter;
    }

    private boolean isPrincipal(int a,int b)
    {
        if (a==b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean isSecondary(int a, int b)
    {
        if (a+b==I_LENGTH+I_LENGTH-actualLength-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean isPrime(int n)
    {
        if (n==2)
        {
            return true;
        }
        if (n==1)
        {
            return false;
        }
        for (int i=2; i<=n/2; i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return  true;
    }

    private int prime=0;

    private void count()
    {
        int i,j;
        for (i=I_LENGTH-actualLength; i<I_LENGTH; i++)
        {
            for (j=J_LENGTH-actualLength; j<J_LENGTH; j++)
            {
                if(isPrincipal(i,j) || isSecondary(i,j))
                {
                    if (isPrime(matrix[i][j]))
                    {
                        prime++;
                    }
                }
            }
        }
    }

    public void getRatio()
    {
        count();
        double a,b,r;
        a=prime;
        b=actualLength+actualLength-1;
        r=a/b;
        r*=100;
        System.out.println(((int) r)+"%");
    }

    public int getRatioInt()
    {
        count();
        double a,b,r;
        a=prime;
        b=actualLength+actualLength-1;
        r=a/b;
        r*=100;
        return (int) r;
    }
}
