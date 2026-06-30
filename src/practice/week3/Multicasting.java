package practice.week3;

public class Multicasting {
    static void main(String[] args) {
        A[] arr = {new B(),new C(),new D()};  //upcasting => upcasting (child → parent).

        // Can I cast arr[1] alias C into B
        ((B)arr[1]).fun2();

        // can I cast D into B or C => yes

        // what would fail?
//        ((C)arr[0]).fun3(); // these will fail at Run-Time
    }
}

class A{
    void fun1(){
        System.out.println("A");
    }
}
class B extends A {
    void fun2(){
        System.out.println("B");
    }
}
class C extends B{
    void fun3(){
        System.out.println("C");
    }
}
class D extends C{
    void fun4(){
        System.out.println("D");
    }
}