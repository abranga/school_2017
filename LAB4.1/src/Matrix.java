import org.jetbrains.annotations.Nullable;

import java.util.Scanner;


/**
 * Created by abran on 01.11.2016.
 */


public class Matrix
{
    private int rows,columns;
    private double[][] matrix;

    public Matrix()
    {
        rows=columns=0;
    }

    public Matrix(int rows,int columns)
    {
        this.rows=rows;
        this.columns=columns;
        matrix=new double[rows][columns];
    }

    public void copyMatrix(double[][] m)
    {
        matrix=m;
    }

    public void readMatrix()
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.println("R:"+i+" C:"+j+">>");
                matrix[i][j]=sc.nextDouble();
            }
        }
    }

    public void printMatrix()
    {
        System.out.println("The matrix is:");
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void fillMatrix(double x)
    {
        for (int i=0; i<rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix[i][j] = x;
            }
        }
    }

    public void multiplyByScalar(double x)
    {
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                matrix[i][j]*=x;
            }
        }
    }

    public void divideByScalar(double x)
    {
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                matrix[i][j]/=x;
            }
        }
    }

    public int getRows()
    {
        return  rows;
    }

    public int getColumns()
    {
        return columns;
    }

    public double getElement(int r,int c)
    {
        return matrix[r][c];
    }

    public void setElement(int r, int c,double x)
    {
        matrix[r][c]=x;
    }

    public static Matrix addMatrices(Matrix a, Matrix b)
    {
        if ((a.getRows()==b.getRows()) && (a.getColumns()==b.getColumns()))
        {
            Matrix m=new Matrix(a.getRows(),a.getColumns());
            for (int i=0; i<m.getRows(); i++)
            {
                for (int j=0; j<m.getColumns(); j++)
                {
                    m.setElement(i,j,(a.getElement(i,j)+b.getElement(i,j)));
                }
            }
            return m;
        }
        else
        {
            System.out.println("Matrix sizes not good for addition!!!");
            return  null;
        }

    }

    public static Matrix subtMatrices(Matrix a, Matrix b)
    {
        if ((a.getRows()==b.getRows()) && (a.getColumns()==b.getColumns()))
        {
            Matrix m=new Matrix(a.getRows(),a.getColumns());
            for (int i=0; i<m.getRows(); i++)
            {
                for (int j=0; j<m.getColumns(); j++)
                {
                    m.setElement(i,j,(a.getElement(i,j)-b.getElement(i,j)));
                }
            }
            return m;
        }
        else
        {
            System.out.println("Matrix sizes not good for addition!!!");
            return  null;
        }
    }

    private static double rowTimesColumn(double elem,Matrix b,int cb)
    {
        double t=0;
        for (int j=0; j<b.getRows(); j++)
        {
            t+=elem*b.getElement(cb,j);
        }
        return t;
    }


    public static Matrix multiplyMatrices(Matrix a, Matrix b)
    {
        if(a.getColumns()==b.getRows())
        {
            Matrix m=new Matrix(a.getRows(),a.getColumns());
            for (int i=0; i<m.getRows(); i++)
            {
                for (int j=0; j<m.getColumns(); j++)
                {
                    m.setElement(i,j,( /* */    rowTimesColumn(a.getElement(i,j),b,j)     /* */ ));
                }
            }
            return m;
        }
        else
        {
            System.out.println("Matrices not good for multiplication!!!");
            return null;
        }
    }
}
