public class Main {

    public static void main(String[] args)
    {
        Matrix m=new Matrix(5,5);
        m.fillMatrix(8.6);
        Matrix n=new Matrix(5,5);
        n.fillMatrix(3.4);
        Matrix a=Matrix.multiplyMatrices(m,n);
        a.printMatrix();
    }
}
