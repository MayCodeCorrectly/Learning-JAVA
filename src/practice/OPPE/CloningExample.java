package practice.OPPE;
import java.util.*;

public class CloningExample {

    public static void main(String[] args) {
        Person p = new Person("Alex", "Periperi", new Date());
        Person p1;
        try {
            p1 = p.clone();
            p1.fname = "Bob";
            
            System.out.println(p);
            System.out.println(p1);

        } catch (CloneNotSupportedException e) {
            System.out.println("it won't happen");
        }
        
    }
}

class Person implements Cloneable{
    String fname;
    String lname;
    Date dob;

    public Person(String fn, String ln, Date bDay){
        this.fname = fn;
        this.lname = ln;
        this.dob = bDay;
    }

    public Person clone() throws CloneNotSupportedException{
        Person cloneP = (Person) super.clone();
        cloneP.dob = (Date) this.dob.clone();
        return cloneP;
    }

    @Override
    public String toString() {
        return this.fname+" "+this.lname+" and his birthdate is "+this.dob;
    }

}
