package Week3;
import java.util.Scanner;

public class printing {
    int age;
    String name;

    // make it static or else you will not be able to access in static function => main
    static Scanner sc = new Scanner(System.in);

    printing(String n,int a){
        name = n;
        age= a;
    }

    // overriding default printing of this class
    @Override
    public String toString(){
        return "Name is "+name+" and age is "+age;
    }

    static void main(String[] args) {
        printing p = new printing(sc.nextLine(),sc.nextInt());

        System.out.println(p);
        // normally it would have printed like "printing@hascode"
        // but now it has been overridden
    }
}
