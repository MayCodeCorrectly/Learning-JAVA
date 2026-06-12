package practice.week1;
import java.util.Scanner;

public class input {
    int get_int;
    String get_word;
    String get_String;
    float get_float;
    double get_double;

    Scanner sc = new Scanner(System.in);

    // Constructor
    input(String b, int a, double c) {
        this.get_int = a;
        get_String = b;
        get_double = c;
    }

    int take_int() {
        get_int = sc.nextInt();
        return get_int;
    }

    String take_word() {
        get_word = sc.next();
        return get_word;
    }

    String take_string() {
        get_String = sc.nextLine();
        return get_String;
    }

    static void main(String[] args) {

        input i = new input("String", 10, 10.2);
        System.out.println("Enter your favourite number: ");
        int fav_num = i.take_int();
        System.out.println("Oh! is that your's fav number too mine is also " + fav_num);

        // providing constructor a user input directly
        Scanner scn = new Scanner(System.in);
        input o = new input(scn.nextLine(), scn.nextInt(), scn.nextDouble());
        System.out.println("the int is: " + o.get_int + "\nTHe string is: " + o.get_String + "\nthe double is: " + o.get_double);

    }
}