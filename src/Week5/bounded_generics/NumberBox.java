package week5.bounded_generics;

// Now this class can only work with number types or its children's
public class NumberBox<T extends Number>{
    private  T value;

    public NumberBox(T val){
        value = val;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
