public class Main {

    public static void myMethod(String a)
    {
        a.concat("//abcdef");
        System.out.println(a);
    }

    public static void main(String[] args) {
        String string=null;

        try
        {
            myMethod(string);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            string =new String("and");
            myMethod(string);
        }
        finally {
            System.out.println("Repaired!");
        }
    }
}
