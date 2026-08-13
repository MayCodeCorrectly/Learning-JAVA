package Week7.Questions;

public class Q4 {
    
    public static void main(String[] args) {
        System.out.println(fun()); // it would be ten
    }


    static int fun(){
        try{
            return 5;
        }
        finally{
            return 10;
        }
    }
}
