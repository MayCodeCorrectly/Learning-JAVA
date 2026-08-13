package week5;

import java.util.ArrayList;

class A {
    @Override
    public String toString() {
        return "This is obj";
    }
}

class B extends A {
}

public class SubType {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<>();

        B obj = new B();
        list.add(obj);   // No error

        list.add(new A()); // Also fine

        System.out.println(list);
    }
}