package Week2;

public class Classes_Objects {
        public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.speed = 120;

        c1.drive();

    
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rahul";
        s1.marks = 99;
        s2.name = "Priya";

        System.out.println(s1.name+ " has got "+s1.marks+" marks");
        System.out.println(s2.name+ " has got "+s2.marks+" marks");


        // make instance of teacher class
        Teacher t1 = new Teacher();
        t1.name = "May"; t1.subject = "Mathematics"; t1.dept = "Mechanical";
        // can't directly access salary need to use get and set salary method
        t1.setSalary(100000);System.out.println(t1.getSalary());

    }
    
}

class Car {
    String color;
    int speed;

    // instance ka part hai na ki class ka to => No static
    void drive() {
        System.out.println(color + " car is driving at " + speed + " km/h");
    }
}


class Student {
    String name;
    int marks;
}

class Teacher{
    String name;
    String subject;
    String dept;
    private double salary;

    // Since get and set are part of instance not class no need of 'static' keyword
    public void setSalary(double sal){
        if (sal>=0.0 && sal<=10000000.0)
            this.salary = sal;
        else System.out.println("Invalid assignment of salary");
    }

    public double getSalary(){
        return this.salary;
    }

}
