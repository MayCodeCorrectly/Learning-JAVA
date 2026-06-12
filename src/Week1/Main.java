package Week1;
// If one .java file declares three separate classes then the compilation will produce three separate .class files with the name of the classes.

// You can have different classes in a same file, only restriction is that only one of them can be 'public' and that class's name has to be same as the file name.


public class Main {
    // there must be main function as C++ => A starting point
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int x =12;
        int y  = x+7;
        System.out.println(y);
        myfunc(); // invoking helper function

        String s = "new string";

        System.out.println(s.getClass()+"\n"); // this gives class class_name
        System.out.println(s.getClass().getName()); // but this gives class_name only
    }
    // only main will get executed others are helper and can't get invoked without including them in main
    public static void myfunc(){
        System.out.print("Hello from " +
                "myfunc\n");
    }
}


class NewMain{
    public static void new_func(){
        System.out.println("Is this valid");
    }
}