package Week4;

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    abstract void makeSound();
    // if i make this method public then i must change the implementation in class Dog and Bird to public
}

class Dog extends Animal {
    // if class extends abstract class it must implement all the abstract methods
    // then only we can instantiate object of that subclass
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

interface Flyable {
    // methods in interface are public abstract (implicitly)
    void fly();
}

class Bird extends Animal implements Flyable{
    // constructor is req
    Bird(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Chi Chi");
    }

    @Override
    public void fly(){
        // so when u do not write public visibility of method gets decreased to package-private
        // which is not allowed
        System.out.println("Bird is flying");
    }
}

public class Test_Animal {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.makeSound();
        d.sleep();

        Bird b = new Bird("Sparrow");
        b.makeSound();
        b.fly();
        b.sleep();

        // This is runtime polymorphism (dynamic dispatch).
        Animal[] animals = {
                new Dog("Tommy"),
                new Bird("Sparrow")
        };

        for (Animal a : animals) {
            a.makeSound();  // calls Dog's or Bird's version at runtime
        }
    }
}

/*
| Feature                      | Abstract Class                                | Interface                                   |
| ---------------------------- | --------------------------------------------  | ------------------------------------------- |
| Can have instance variables? | ✅ Yes                                        | ❌ Only constants (`public static final`)    |
| Can have constructors?       | ✅ Yes                                        | ❌ No                                        |
| Can have concrete methods?   | ✅ Yes                                        | ✅ Yes (`default` and `static` methods)      |
| Can have abstract methods?   | ✅ Yes                                        | ✅ Yes                                       |
| Inheritance keyword          | `extends`                                     | `implements`                                |
| Multiple inheritance?        | ❌ A class can extend only one abstract class | ✅ A class can implement multiple interfaces |
| Represents                   | "is-a" relationship with shared code          | Capability/contract                         |

 */