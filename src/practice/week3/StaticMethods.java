package practice.week3;

// *Static methods are inherited, but they can not be overridden or have dynamic dispatch

/*
Feature	                            Instance Method	    Static Method
Inherited	                              ✅ Yes	    ✅ Yes
Overridden	                              ✅ Yes	    ❌ No (hidden instead)
Uses runtime polymorphism	              ✅ Yes	    ❌ No
Resolved by	                    Actual object type	    Reference/class type

So your statement is correct: static methods do get inherited, but they do not participate in polymorphism or overriding.
 */

public class StaticMethods {
    static void main(String[] args) {
        Parent p = new Child();

        p.display(); // or Parent.diplay()        // Parent display
        Child.display();   // Child display

        //Math m = new Math();  // private constructor hai Math ka

        // Static variable
        Animal e1 = new Animal();
        e1.name = "Dog";  // Static variables and methods can be accessed by Object too, but it is bad practice
        e1.display_name(); // "Dog"

        Animal e2 = new Animal();
        e2.name = "Cat";
        e2.display_name(); // "Cat"

        Animal.name = "Horse";
        e1.display_name();
        e2.display_name();

    }
}

class Parent {
    static void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child display");
    }
}

// Casting Problem
class CastingProblem {
    public static void main(String[] args) {
        Parent[] arr = new Child[2];

        arr[0] = new Child();   // OK
        arr[1] = new Parent();  // Runtime Exception
    }
}

class Animal{
    static String name;

    void display_name(){
        System.out.println(name);
    }
}