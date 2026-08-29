package Week9;

import java.util.*;
import java.util.stream.Stream;

public class OptionalTypes {
    static void main(String[] args) {
        Optional<Double> randMax = Stream.generate(Math::random)
                .limit(100)
                .filter(n -> n < 0.001)
                .max(Double::compareTo);

        System.out.println(randMax); // it is empty
        // as the name suggest optional is used when you expect empty output

        // there is method called orElse for optional types
        randMax.orElse(-0.00001);
        System.out.println("Optional value if empty: " + randMax);

        Optional<Double> z = inverse(0.0);
        System.out.println("Value of z is: " +z +", "+ z.isPresent()); // .get() is used to extract the value of z
        // safer operation
        z.ifPresentOrElse(System.out::println, () -> System.out.println("Value is not there"));

        System.out.println(inverse(10.0));
        System.out.println(inverse(0.0));

    }

    public static Optional<Double> inverse(Double x) {
        if (x == 0)
            return Optional.empty();
        else
            return Optional.of(1 / x);
    }
}
