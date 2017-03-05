public class Main {

    public static void main(String[] args) {

        int a,b,c;
        long s;
        a=1;
        b=2;
        c=3;
        s=3;
        do
        {
            if (c%2==0)
            {
                s+=c;
            }
            a=b;
            b=c;
            c=a+b;
        }while (c<=4000000);

        System.out.print("Sum is: "+s);
    }
}
