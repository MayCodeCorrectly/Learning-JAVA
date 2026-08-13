package Week6.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TestSets {
    static void main(String[] args) {
        HashSet<Number> num_set1 = new HashSet<>();
        num_set1.add(10);
        num_set1.add(10.12);
        num_set1.add(199);
        num_set1.add(1.465321);
        num_set1.add(78);
        boolean val = num_set1.add(10);  // duplicate so add will return false
        System.out.println(val);

        // Since HashSet uses hash function to store values those are randomly dispersed
        System.out.println(num_set1);

        TreeSet<Integer> num_set2 = new TreeSet<>();
        num_set2.add(10);
        num_set2.add(100);
        num_set2.add(789);
        num_set2.add(1);
        num_set2.add(-789);
        num_set2.add(1024);
        num_set2.add(10);  // same here to

        num_set2.remove(10); // removes the object from set

        // But TreeSet uses balanced tree to store values so values are sorted and then stored
        System.out.println(num_set2);

        // There is one more LinkedSet where order of elements is maintained in the order of their insertion

    }
}
