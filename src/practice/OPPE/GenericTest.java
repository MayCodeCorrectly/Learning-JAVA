package practice.OPPE;

public class GenericTest<T> {
    
    // now this function takes V and returns V which is independent of T 
    public <V> V doSomething(V x){
        return x;
    }

}
