import java.util.*;

public class PhoneBook {

    private final Map<String, Set<String>> book = new HashMap<>();

    public void add(String surname, String phone) {
        Set<String> value = book.get(surname);
        if (value == null) {
            book.put(surname, Set.of(phone));
        } else {
            HashSet<String> phones = new HashSet<>(value);
            phones.add(phone);
            book.put(surname, phones);
        }
    }

    public Set<String> get(String surname) {
        return book.get(surname);
    }

}
