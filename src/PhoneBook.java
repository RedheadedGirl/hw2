import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<String, List<String>> book = new HashMap<>();

    public void add(String surname, String phone) {
        List<String> value = book.get(surname);
        if (value == null) {
            book.put(surname, List.of(phone));
        } else {
            ArrayList<String> phones = new ArrayList<>(value);
            phones.add(phone);
            book.put(surname, phones);
        }
    }

    public List<String> get(String surname) {
        return book.get(surname);
    }

}
