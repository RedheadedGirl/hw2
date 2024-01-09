import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        String[] array = new String[] {"original1", "original2", "original3", "duplicate1", "original4", "duplicate2",
                "duplicate1", "original5", "duplicate2", "original6", "original7", "duplicate1", "duplicate2",
                "duplicate3", "duplicate2", "original9", "duplicate3"};

        System.out.println("Всего слов: " + array.length);

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String i : array) {
            Integer value = map.get(i);
            if (value == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++value);
            }
        }

        System.out.println("Уникальные слова: ");
        map.forEach((k, v) -> System.out.println((k)));
        System.out.println("Количество уникальных слов: " + map.size() + "\n");
        map.forEach((k, v) -> System.out.println((k + " встречается " + v + " раз")));
    }

    private static void task2() {
        PhoneBook book = new PhoneBook();
        book.add("Doe", "111");
        book.add("Smith", "202");
        book.add("Doe", "112");
        book.add("Doe", "112");
        if (book.get("Doe").isPresent()) {
            System.out.println("Doe: " + book.get("Doe").get());
        } else {
            System.out.println("Doe not found");
        }
        if (book.get("Фамилия, которой нет в справочнике: ").isPresent()) {
            System.out.println("Фамилия, которой нет в справочнике: " +
                    book.get("Фамилия, которой нет в справочнике: ").get());
        } else {
            System.out.println("Нет такой фамилии");
        }
    }
}
