package Week2;

public class DataTypes {
    public static void main(String[] args){
        // declarations
        int x=0,y;
        float div_res = 0.11f; // this f indicates that this is float or else it will be considered double
        double accurate_div_res; // for long floating values (8 byte)
        long a;
        boolean is_male;
        char Grade;
        char symbol = '\u03C0'; // in form of unicode (Greek pi) 

        System.out.println(x);
        System.out.println(symbol);

        is_male = true;
        Grade = 'S'; // single quotes only '' 
        // double quotes represent the string

        // we can not redeclare any variable
        // char Grade; // Duplicate local variable Grade

        // And to fix variable value we use 'final' keyword
        final int out_of = 10;
        // out_of = 100; // this throws error cause out_of is constant

        String name = "Alex Peri-peri"; // in "" always 
        // string is built in class in Java
        // System.out.println(name[0]); // slicing is not allowed
        // since string is not array of character

        String s = "Hello";
        s = s.substring(0,3)+"p!"; // + is for concatenation
        System.out.println(s);

        // array => it is an object too
        int[] arr;
        arr = new int[50]; // array of 50 int's

        // int[] a ot int a[] both are valid
        System.out.println(arr); // memory location of first element in the block of memory
        arr[0] =10;
        System.out.println(arr[0]+arr[2]);
        // initially all the elements in arrays are initialized to 0    
        System.out.println(arr.length);
        // No need of () cause it is not a method it is instance variable of class array

        // but for string we need ()
        System.out.println(s.length());
        // here length is method not variable

        arr = new int[100]; // this is new array older one gets collected by garbage collector
        System.out.println(arr.length); // size of array can not vary
        System.out.println(arr[0]);  

        int arr2[] = {10,20,30,40,50};
        System.out.println(arr2.length);
        System.out.println(arr2[0]); 

        int[] arr3 = new int[5];
        arr3 = new int[10]; // ✅ LEGAL — same variable, now points to a different array

        // initializing array with values
        int arr4[] = new int[]{10,20,30,40,50};//  put size or not does not matter

        for(int i =0;i<arr4.length;i++) System.out.println(arr4[i]);

        // user defined class object
        Car my_car;
        my_car = new Car();
        my_car.color  = "Black"; my_car.speed =180;
        my_car.drive();

    }
}
