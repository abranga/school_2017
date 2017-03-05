public class Main {

    public static void main(String[] args) {

        Rodent r=new Rodent(78.36,10.3,1,2,3);
        r.getDetails();
        r.foodPrint();

        System.out.println();
        System.out.println();
        System.out.println();

        Mouse m=new Mouse(2.3,3.2,1,2,3);
        m.getDetails();
        m.foodPrint();
    }
}
