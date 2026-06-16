package practice.week2.Arrays;

public class Arrays_Intro {
    static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];  // now all the elements in array are init to 0
        System.out.println(arr.length); // the length here is instance variable not method

        for(int x: arr) System.out.print(x+" ");


        System.out.println();

        int[] init_arr = {10,20,30,40,50,60,70,70,80,90}; // declared and initialized
        // no need to mention array size there

        String[] strArray = new String[10]; // now the array of String ("null" by default) is created and pointing to
        // first element of array

        // arrays coping
        System.arraycopy(init_arr,0,arr,0,10);
        for(int x:arr) System.out.print(x+" ");

        // array is contained at Heap memory but its reference is at local variable at Stack memory
        // usually address of the first element of array is stored in that local variable

    }
}
