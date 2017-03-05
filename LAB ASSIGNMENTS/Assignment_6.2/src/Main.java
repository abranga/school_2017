public class Main {

    public static void main(String[] args)
    {
        int ct=0;
        while (ct<6)
        {
            int a =  1 + (int)(Math.random() * 49);
            if(a<=49)
            {
                System.out.print(a+" ");
                ct++;
            }
        }
    }
}
