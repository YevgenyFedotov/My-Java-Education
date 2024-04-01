package Unsorted;

import java.io.InputStream;
import java.io.NotSerializableException;
import java.lang.reflect.MalformedParametersException;
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //Stream.of(1, 2, 3, 4, 5).filter(x -> x <= 3).forEach(System.out::println);
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(10, (acc, x) -> acc + x);// = 25
        Optional<Integer> i = Stream.of(1, 2, 3, 4, 5).reduce((acc, x) -> acc + x);
        System.out.println(i.get());
        Stream.of(i).forEach(System.out::println);
        i.get();

        Stream.generate(() ->"Fuck off").limit(5).forEach(System.out::println);

        List<String> list = List.of("sad","asdaf","asdaf");
        Stream<String> names = Stream.of("sad","asdaf","asdaf");
        System.out.println(names.findAny().get());
        System.out.println(names.findFirst());
    }
}
