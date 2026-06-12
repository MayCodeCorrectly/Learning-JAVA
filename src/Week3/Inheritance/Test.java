package Week3.Inheritance;

public class Test {
    static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.hasPower());

        c.setAge(67); // not assigned

        Student s = new Student("john",28);

    }
}
