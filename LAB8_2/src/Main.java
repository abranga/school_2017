public class Main {

    public static void main(String[] args) {

        try {
            throw new MyException("alabala");
        }
        catch (MyException e)
        {
            System.out.println(e.getMsg());
        }
        finally {
            System.out.println("FINLLY");
        }
    }
}
