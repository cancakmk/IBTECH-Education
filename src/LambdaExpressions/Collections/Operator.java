package LambdaExpressions.Collections;

import java.util.stream.Stream;

public class Operator {
    public static void main(String[] args)
    {

        // Get the stream
        Stream<String> stream
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");

        // Print the stream
//        stream.forEach(s -> System.out.println(s));
        stream.forEach(System.out::println);
    }
}
