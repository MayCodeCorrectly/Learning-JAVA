package Week4;

class Outer {
    class Inner {
        void display() {
            System.out.println("Hello from Inner");
        }
    }

    // static class does not depend on outer object
    static class st_cls{
        void display(){
            System.out.println("Hello from static inner class");
        }
    }
}
public class Outer_Inner {
    public static void main(String[] args) {

        Outer outerObj = new Outer();          // Create outer object
        Outer.Inner innerObj = outerObj.new Inner(); // Create inner object
        innerObj.display();

        Outer.st_cls Oobj = new Outer.st_cls();  // directly create an object of inner class using static
        Oobj.display();
    }
}
