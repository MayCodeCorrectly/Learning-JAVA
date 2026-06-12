package practice.week1;

public class Arithmetic {
    public static void main(String[] args){
        // pre&post increment
        int a = 10;

        // pre increment
        System.out.println(++a); // increment to 11 and print 11
        // post increment
        System.out.println(a++); // print 11 and then increment to 12
        System.out.println(a);

        // Same follow for decrement

        // float modulo
        float x, y;
        x = 10.5f; y = 2.0f;
        System.out.println(x% y);
//        => what it does is a%b = a - b*(int)(a/b)
//        means convert x/y to int mul it by y then sub it from x
    }
}
