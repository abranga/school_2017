public class Main {

    public static void main(String[] args) throws Exception
    {
        try
        {
            throw new Exception("Exception thrown!");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally block here!");
        }
    }
}
