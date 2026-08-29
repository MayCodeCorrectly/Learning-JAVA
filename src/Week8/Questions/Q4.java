package Week8.Questions;
class Example<T> {
    T ob;

    Example(T x) {
        this.ob = x;
    }

    public String show() {
        return "" + ob.getClass().getName();
    }

    public T get() {
        return ob;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Example<Number> n = new Example<Number>(100);
        Example<Double> e = new Example<Double>(10.5);
//        n = e;
        System.out.print(n.show() + "\n" + n.get());
    }
}