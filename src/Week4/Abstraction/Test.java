package Week4.Abstraction;

public class Test {
    public static void main(String[] args) {
        // We direclt can not make an object of an abstract class.
//        Animal animal = new Animal();
        // 'Animal' is abstract; cannot be instantiated
        // Abstract class => Inherit => Implement abstract methods  => Make Object
        Animal e1 = new Dog("Bob","Male",2);
        System.out.println(e1);

        Animal c1 = new Cat("Ella","Female",3);
        System.out.println(c1);

        c1.Sleep();
        e1.Sleep();

        System.out.println(Animal.getCount());

        System.out.println(e1.getClass().getSimpleName());

    }
}
