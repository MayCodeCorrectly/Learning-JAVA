package Week5.generic_class;

// This is our generic box which can hold any type of datatype and wwe don't even need to manual cast it
public class Box<T> {
    private T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }

}
