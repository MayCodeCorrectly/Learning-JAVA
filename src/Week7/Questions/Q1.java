package Week7.Questions;

public class Q1 {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            int c = a / b;
            System.out.println("Division is" + c);
        }
//        finally {
//            System.out.println("Hello there!!1");
//        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }
    }
}
