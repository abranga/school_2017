public class Main {

    public static void main(String[] args)
    {

        Ticket t = new Ticket(6);

        t.getNumbers();
        t.printTicket();

        Extraction ext = new Extraction(6);

        ext.generate();
        ext.printNumbers();

    }
}
