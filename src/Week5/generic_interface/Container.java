package Week5.generic_interface;

public interface Container<T> {
    void add(T item);

    T get(int pos);
}
