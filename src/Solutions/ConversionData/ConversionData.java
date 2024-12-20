package Solutions.ConversionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
Преобразование данных
*/

public class ConversionData {

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        //напишите тут ваш код
        return accounts.stream().map(Account::getEmail);
    }
}

