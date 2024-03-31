package StreamAPI;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculatorTest {
    public static void main(String[] args) {
        //Первое задание
        Calculator<Integer> intSum = (a,b) -> a + b;
        Calculator<Double> doubleDegree = (a,b) -> a - b;
        Calculator<Long> longMultiply = (a,b) -> a * b;
        Calculator<Float> floatDiv = (a,b) -> a / b;
        System.out.println(intSum.calculate(2,2));
        System.out.println(doubleDegree.calculate(2.0,2.0));
        System.out.println(longMultiply.calculate(2l,2l));
        System.out.println(floatDiv.calculate(2f,2f));
        //Второе задание
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Yevhen");
        strings.add("Mihail");
        strings.add("Andrey");
        strings.add("Alexandr");
        strings.add("Dmitry");
        strings.stream()
                .map(x -> {
                    if (!x.startsWith("A")) {
                        return x.toUpperCase();
                    }
                    return x;
                })
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //Stream.of(strings).forEach(System.out::println);
        System.out.println("Chapter 2");
        List<String> firstlist =  strings.stream()
                .filter(x -> x.startsWith("A"))
                        .collect(Collectors.toList());
        List<String> secondList = strings.stream()
                .filter(x -> !x.startsWith("A"))
                .map(x -> x.toUpperCase())
                        .collect(Collectors.toList());
        for(String elem: secondList){
            firstlist.add(elem);
        }
        firstlist.stream()
                .sorted()
                        .forEach(System.out::println);


        //Третье задание
        System.out.println("Chapter 3");
        int[] intArray = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
        int sqrSum = Arrays.stream(intArray)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce((sum,x) -> sum + x)
                .getAsInt();
        System.out.println(sqrSum);
        System.out.println("Chapter 4");
        //Четвертое задание
        //Список строк из второго задания
        StringProcessor stringUpper = (str) -> str.toUpperCase();
        StringProcessor revers = CalculatorTest::processor;
        strings.stream()
                .map(x -> stringUpper.processor(x))
                .forEach(System.out::println);
        strings.stream()
                .map(x -> revers.processor(x))
                .forEach(System.out::println);
        System.out.println("Chapter 5");
        //Пятое задание
        //список чисел из третьего задания
        int max = Arrays.stream(intArray)
                .max()
                .getAsInt();
        System.out.println("Max is " + max);
        int min = Arrays.stream(intArray)
                .min()
                .getAsInt();
        System.out.println("Min is " + min);
        int sum = Arrays.stream(intArray)
                .sum();
        System.out.println("Sum is " + sum);
        double avg = Arrays.stream(intArray)
                .average()
                .getAsDouble();
        System.out.println("Avg is " + avg);

    }

    private static String processor(String str) {
        char[] strAsChar = str.toCharArray();
        for (int i = 0; i < strAsChar.length / 2; i++) {
            char temp = strAsChar[i];
            strAsChar[i] = strAsChar[strAsChar.length -1 -i];
            strAsChar[strAsChar.length - 1 - i] = temp;
        }
        str = String.valueOf(strAsChar);
        return str;
    }
}
