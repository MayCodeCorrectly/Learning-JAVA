package Week8;

import java.util.LinkedList;
import java.util.List;

public class Streams {
    
    public static void main(String[] args) {
        
        List<String> greetings = new LinkedList<>();
        greetings.add("Hi");
        greetings.add("Hello");
        greetings.add("Don't Mind");
        greetings.add("My Pleasure");
        greetings.add("Good day");
        greetings.add("Thanks");

        
        long count = greetings.stream().filter(s -> s.length() > 5).count();  // this count returns a long 
        System.out.println(count);

    }
}
