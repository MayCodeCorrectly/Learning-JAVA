package Week8;

import java.util.Date;

public class TestCloning {
    public static void main(String[] args) {
        
        int a = 10;
        var var = 10; // this is also valid
        int b = a; // not pointing to same memory location 
        b =20;
        System.out.println(a + " & " + b); // what will be the value of a? 10 

        Person p1 = new Person("Test", 20, 178, 60, new Date("12/25/2005"));
        Person p2 = p1; // now this P2 and P1 are just different name for same memory location 
        // means changing one will change another 
        System.out.println(p1);
        p2.setName("Alex");
        System.out.println(p1);  // p2 did change p1

        // actual cloning
        try {
            Person p3 = p1.clone();
            p3.setName("Bob");
            System.out.println(p3);
            System.out.println(p1);
        } catch (CloneNotSupportedException e) {  // this won't happen
            System.out.println("Clone is not valid");
        }
    }
}

class Person implements Cloneable{
    private String name;
    private int age;
    private int height, weight;
    private Date birthDate;


    public Person(String n, int a, int h, int w, Date bd){
        this.name =n;
        age= a;
        height = h;
        weight = w;
        birthDate = bd;
    }

    public void setName(String n){
        this.name = n;
    }

    public String toString(){
        return "Name: " + name +", Age: " + age + ", BirthDate: "+ birthDate;
    }

    // this is not proper cloning
    // public Person clone(){
    //     return new Person(name, age, height, weight, birthDate);
    // }

    // but this is also Shallow Copy
    // @Override
    // public Person clone() throws CloneNotSupportedException {
    //     return (Person) super.clone();
    // }

    // this is deep copy
    @Override
    public Person clone() throws CloneNotSupportedException {
        Person copy = (Person) super.clone();
        copy.birthDate = (Date) this.birthDate.clone();
        return copy;
    }

    public void setDate(Date d){
        birthDate = d;
    }
}

