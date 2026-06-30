package Week4.Interface;

// here we are testing behavior of static methods in interface
interface Employee{
    public static final String Company_Name = "Google";
    // all variables are by default "public static final"

    void printDetails();
    // these methods are public abstract by default

    public default void print(){
        System.out.println("Nothing to print");
    }

    public static void test(){
        System.out.println("testing");
    }
}

class Manager implements Employee{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.println(getName());
    }
}

public class Testing {
    static void main(String[] args) {
        Employee e1 = new Manager(); // interface can be used as reference type but can make an object of
        e1.print();
        e1.printDetails();
        //e1.test(); // can not call static function/method of interface with variable
        System.out.println(e1.Company_Name);

        System.out.println(Employee.Company_Name);
        Employee.test();
    }
}
