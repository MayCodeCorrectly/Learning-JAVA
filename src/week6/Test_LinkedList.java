package week6;
import java.util.*;

public class Test_LinkedList {
    public static void main(String[] args) {
        Queue<String> list1 = new LinkedList<String>();
        list1.add("IITM");
        list1.add("Java");
        list1.add("Programming");
        list1.poll(); // Line 1

        Queue<String> list2 = new LinkedList<String>();
        list2.add("IITM");
        list2.add("Java");
        list2.add("Programming");
        list2.peek(); // Line 2

        System.out.println("list 1 elements " + list1); // Line 3
        System.out.println("list 2 elements " + list2); // Line 4

        ArrayList<String> names = new ArrayList<>();
        names.add("Sandeep");
        names.add("Sandeep");
        names.add("Sandeep");
        System.out.println(names);



    }
}
