public class Main {

    public static void main(String[] args) {
        try {
            Test.f();
        } catch (MyException e) {
            e.getMsg();
        }
    }
}
