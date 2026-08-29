package Week9;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person implements Serializable{
    int id;
    String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: "+ this.id + " name: "+ this.name;
    }
    
}

public class StreamToMap {
    public static void main(String[] args) {
            
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person(0, "Andy"));
        people.add(new Person(1,"Alex"));
        people.add(new Person(2, "Bob"));

        // now convert this into Stream
        Stream<Person> peopleStream =  people.stream();

        // convert it into map
        // Map<Integer, String> personMap = peopleStream.collect(
        //     Collectors.toMap(
        //         Person::getId,
        //         Person::getName
        //     )
        // );

        // System.out.println(personMap);
        
        Map<Integer, Person> personMap2 = peopleStream.collect(
            Collectors.toMap(
                Person::getId,
                Function.identity()
            )
        );

        System.out.println(personMap2);



    }
}
