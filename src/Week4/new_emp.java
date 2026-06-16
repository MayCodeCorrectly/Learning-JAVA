package Week4;

class Person {
    public String getName(){
        return "No name";
    }
}

interface Designation{
    public default String getName(){
        return "No Designation";
    }
}

public class new_emp extends Person implements Designation{
    // now which getName method does this class inherits
    public static void main(){
        new_emp n1 = new new_emp();
        System.out.println(n1.getName());
        // priority goes to class

        // ================ IMP ==============
        // 1. if class extends another class and implements interface
        // and they both happen to have exact same method (same name and signature)
        // then priority is given to the class method
        // 2. if class implements 2 or more interfaces, and they have common method then class
        // itself has to implement that method in its block
        // ==> New implementation of that method only in implementing Class
    }
}




