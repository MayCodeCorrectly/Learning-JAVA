package Week3.Inheritance;

class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);       // call Person constructor
        this.rollNo = rollNo;
        System.out.println("Student constructor called");
    }
}