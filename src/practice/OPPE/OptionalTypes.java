package practice.OPPE;

import java.util.*;
import java.util.stream.*;

public class OptionalTypes {
    public static void main(String[] args) {
        
        Optional<Double> maxVal = Stream.generate(Math::random)
                                .limit(100)
                                .filter(x -> x<0.001)
                                .max(Double::compareTo);
        maxVal.ifPresent(System.out::println);

        Optional<Double> rev = inverse(10.0);
        rev.ifPresentOrElse( 
            v -> System.out.println(v),
            () -> System.out.println("Empty Value")
        );
    }

    public static Optional<Double> inverse(Double x){
        if(x== 0.0){
            return Optional.empty();
        }else return Optional.of(1/x);
    }
}
