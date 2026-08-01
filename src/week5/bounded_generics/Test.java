package week5.bounded_generics;

public class Test {
    static void main(String[] args) {

        NumberBox<Integer> num1 = new NumberBox<>(10);
        NumberBox<Double> num2 = new NumberBox<>(10.0);
        NumberBox<Float> num3 = new NumberBox<>(10.0f);
        // but below one is not valid cause it does not extend Number class
//        NumberBox<String> num4 = new NumberBox<String>();
    }
}
