package practice.week1;

// The  program can be without public class
class First{
    public static void main(String[] args){
        System.out.println("Hello from First");

        //we can access these args as this is array of string
        for(String arg:args) {
            System.out.println(arg);
        }
        // e.g, java First hi1 h2
        // will print hi1 and hi2

    }
}

class Second{
    public static void main(String[] y){
        System.out.println("Hello from Second");
    }
}

// final here says that you can not inherit this class
final class Third{
    public static void main(String[] z){
        System.out.println("Hello from Third");
    }
}

//class Fourth extends Third{} // gives error