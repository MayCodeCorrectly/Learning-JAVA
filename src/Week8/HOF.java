package Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
public class HOF {
    public static void main(String[] args) {
        
        String[] s_arr = new String[5];
        s_arr[0] = "Sandeep";
        s_arr[1] = "Sandeeep";
        s_arr[2] = "Sandeeeep";
        s_arr[3] = "Sandeeeeep";
        s_arr[4] = "Sandeeeeeep";
        
        // now sort is the function which takes another function (Lambda) as arg for 
        // the parameter which we have to consider while sorting 
        // Arrays.sort(s_arr,(String a,String b) -> a.length()-b.length());

        // type inference can be done 
        Arrays.sort(s_arr,(a,b) -> a.length()-b.length());

        for(String s:s_arr){
            System.out.print(s+" ");
        }System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();
        // intList.forEach((x) -> x+10);

        Stream<String> s = Arrays.asList(s_arr).stream();
        s.filter((i) -> i.length()>8).forEach(System.out::println);
        
        Stream.generate(Math::random).limit(10).forEach((i) -> System.out.println(i));

        Stream.iterate(0, n -> n<10 , n -> n+1).forEach(System.out::println);
    }
}
