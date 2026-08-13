package Week7.Questions;
//
//import java.math.BigDecimal

import Week4.Abstraction.Animal;  // example import statement

public class Q3 {
    public static void main(String args[]) {


        try {
            System.out.println("Quotient is:" + 0/0);
        }
        catch(ArithmeticException e) {
            System.out.println("Denominator should not be zero");
            System.exit(1);
        }
        finally {
            System.out.println("you are in finally..");
        }
    }
}
