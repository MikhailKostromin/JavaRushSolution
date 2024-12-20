package Solutions.ConversionData;

import java.util.stream.Stream;

/*
Преобразование данных-2
*/

public class ConversionData2 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        //напишите тут ваш код
        return strings.map(String::toUpperCase);
    }
}
