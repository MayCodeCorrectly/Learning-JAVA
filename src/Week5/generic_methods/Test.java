package Week5.generic_methods;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        method(2);
        method("Name");
        method(10.45);

        // int will not work here Since it is not any class
        Integer[] int_arr= {10,20,30,40,50,60};
        String[] str_arr= {"Alex", "Bob", "Charlie", "Dog"};

        print_arr(int_arr);
        print_arr(str_arr);

        ArrayList<Integer> num_arr = new ArrayList<>();
        num_arr.add(10);
        num_arr.add(20);
        num_arr.add(30);
        printArray(num_arr);
        System.out.println(num_arr);

        System.out.println(genericSum(num_arr));
    }

    // this is generic method
    // type should be written after modifiers and before return type
    public static <T> void method(T item){
        System.out.println(item);
    }

    // this array could be of any type
    public static <T> void print_arr(T[] arr){
        for(T ele:arr)
            if(ele != null){System.out.print(ele + " ");}
            else break;
        System.out.println();
    }

    // but look we don't need to know which type of object it is to print it
    // so using <T> is kind of waste full
    public static void printArray(ArrayList<?> arr){
        for(Object o:arr) System.out.print(o+" ");
        System.out.println();
    }

    public static double genericSum(ArrayList<? extends Number> arr){
        double sum =0.0;
        for(Number n:arr){
            sum += n.doubleValue();
        }
        return sum;
    }
}
