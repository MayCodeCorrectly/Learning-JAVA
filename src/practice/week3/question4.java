package practice.week3;

class Parent1 {
    Parent1() {
        System.out.println("Parent constructor");
    }
}

class Child1 extends Parent1 {

}
public class question4 {
    static void main() {
        Child1 child = new Child1(); // it will have default constructor which will call parent constructor
    }
}
