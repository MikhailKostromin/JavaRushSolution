package Solutions;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class FromStreamToString {

/*
Из потока данных — в строку
*/

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream.collect(joining(" "));
    }
}

