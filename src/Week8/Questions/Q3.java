package Week8.Questions;

interface Destination{
    double book(String initial, String target);
    default void message(){
        System.out.println("Functional interface");
    }
}
public class Q3{
    public static void main(String[] args){
        Destination ref=(A,B)->{
            System.out.println("Travel from "+A+" to "+B);
            return 3.5;
        };
        double fare=ref.book("X","Y");
        System.out.println("Fare: "+fare+" dollars");
        ref.message();
    }
}
