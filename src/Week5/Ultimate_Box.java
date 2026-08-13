package week5;

import java.lang.constant.Constable;
import java.security.PublicKey;

public class Ultimate_Box {
    static void main(String[] args) {
        Container<Integer> my_number = new Container<>(21);
        Container<String> my_name = new Container<>("Sandeep");
        Container<Boolean> is_adult = new Container<>(true);

        // Now I don't need to manual cast this object into their actual data type
        // SO this container is actually holding values of any type without using Object class
        // And it will throw compile time error when type don't match

    }
}

// T is any value you provide while creating an object of this class
class Container<T>{
    private T value;

    public Container(T val){
        this.value = val;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}