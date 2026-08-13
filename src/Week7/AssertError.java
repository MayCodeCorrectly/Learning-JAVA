package Week7;

public class AssertError {
    static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println(fib(-10)+" ");
        }

        int age = 15;
        assert age >= 18 : "Age must be at least 18";
        System.out.println("Program continues...");
    }

    public static int fib(int n){
        assert n >= 0 : "Negative sequence is not defined";
        if (n<=1){
            return n;
        }
        return  0;
    }
}
