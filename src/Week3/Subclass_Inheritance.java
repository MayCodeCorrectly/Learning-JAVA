package Week3;

public class Subclass_Inheritance {
    public static void main(String[] args){

        // now using manager
        Manager m1 = new Manager("abc",150.0);
        m1.setName("Alex"); m1.setSalary(10000000.91);
        m1.setSec("Ella");
        System.out.println(m1.getName() + 
                " is a manager having salary of $"+m1.getSalary()+
                " whose secretary name is "+m1.getSec());
        
        Employee e1 = new Manager("xyz",120.0); // this is valid
        // Manager m2 = new Employee(); // this is not valid coz every emp is not manager
        System.out.println(e1.getClass());
        e1.setSalary(100000.0);

        // can we set secretary to e1?
        // e1.setSec(); // not we cant

        System.out.println(e1.Bonus(10.0)); // this is dynamic dispatch
        // even tho e1 is of type Employee at run time we can see it as Manager 
        // so mangers Bonus method gets applied instead of Employees 

        // Conclusion=> Whether a function can be called on object or not depends on
        // Static type and which definition of function to execute depends on Dynamic type/ run time type
        // also called "Dynamic Dispatch"

        // e.g,
        Employee[] emp_arr = new Employee[4];
        Employee emp1 = new Employee("Alex",120000.89 );
        Employee emp2 = new Employee("Mille",17000.89 );
        Employee mana1 = new Manager("Bob",1270000.89 );
        Employee mana2 = new Manager("Denis",1000000.89 );
        
        emp_arr[0] = emp1; emp_arr[1]= mana1; emp_arr[2] = emp2; emp_arr[3] = mana2;

        for(Employee x:emp_arr)
            System.out.println(x.Bonus(10.0));


        // so how do w set Secretary to e1?
        // Type-Cast ity Manager
        ((Manager) e1).setSec("Tim");

        // ============== Type casting ============
        int new_number = (int) '7';
        // targetType variable = (targetType) expression;

        // but for String to int
        String number_str = "-127";
        int number_int = Integer.parseInt(number_str);
        System.out.println(number_int);

        // trick
        final double pi = 22/7; System.out.println(pi);
        final double acc_pi = (double) 22/7; System.out.println(acc_pi);

        Manager mana = new Manager("Alex",80000);
        System.out.println("Bonus by manager: "+mana.Bonus(10)); // Manager's Bonus()
        System.out.println("Bonus by casting manager into employee: "+((Employee)mana).Bonus(10)); // Manager's Bonus()

        // Both call managers bonus
        //Reason : Casting changes what members are visible at compile time,
        // but overridden instance methods are chosen based on the actual object's type at runtime.
    }
}

class Employee{
    private String name;
    private double salary;
    private String role; 

    //constructors
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
        // here this. is very very important or else it won't get assigned
    }

    // accessors

    // mutators
    public void setName(String emp_name){
        this.name = emp_name;
    }

    public String getName(){
        return this.name;
    }

    public void setSalary(double emp_sal){
        this.salary =emp_sal;
    }

    public double getSalary(){
        return this.salary;
    }

    public double Bonus(double percentage){
        return (percentage/100.0)*this.salary;
    }

    // methods
}

class Manager extends Employee{
    private String secretary;  // a secretary which helps manager
    
    // constructor
    public Manager(String name,double salary){
        super(name,salary);
        // just the word super in enough to call the constructor of parent class

        // But when we cant to access method of super class inside subclass we use super.Method(args) syntax
        }

    // get and set secretary
    public String getSec(){
        return secretary;
    }

    public void setSec(String sec_name){
        secretary = sec_name;
    }

    // method overriding
    @Override
    public double Bonus(double percentage){
        // return (this.getSalary()+(percentage/100.0)*this.getSalary());
        return this.getSalary()+super.Bonus(percentage); // better way
    }
}