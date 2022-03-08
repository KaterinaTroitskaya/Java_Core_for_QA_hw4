package hw4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //region Task 1
        ArrayList<String> withRepeats = new ArrayList<>();
        withRepeats.add("apple");
        withRepeats.add("banana");
        withRepeats.add("orange");
        withRepeats.add("pineapple");
        withRepeats.add("grape");
        withRepeats.add("mango");
        withRepeats.add("grape");
        withRepeats.add("lemon");
        withRepeats.add("banana");
        withRepeats.add("apple");

        noRepeats(withRepeats);

        //endregion

        //region Task2
        PhoneBook book = new PhoneBook();

        book.add("Ivanov", "9999999990");
        book.add("Ivanov", "9999999991");
        book.add("Smirnov", "9999999993");
        book.add("Petrov", "9999999994");
        book.add("Sidorov", "9999999995");
        System.out.println("Задание №2: ");
        System.out.println("Телефонные номера людей с фамилией Иванов: " + book.get("Ivanov"));
        System.out.println("Телефонные номера людей с фамилией Петров: " + book.get("Petrov"));
        //endregion

    }

    //region метод к Task1
    public static void noRepeats(ArrayList<String> withRepeats) {
        HashMap<String, String> noRepeatsArr = new HashMap<>();
        for (int i = 0; i < withRepeats.size(); i++) {
            String s = withRepeats.get(i);
            int x = 1;
            if (noRepeatsArr.containsKey(s)) {
                x = (Integer.parseInt(noRepeatsArr.get(s)) + 1);
            }
            String y = Integer.toString(x);
            noRepeatsArr.put(s, y);
        }
        System.out.println("Задание №1: ");
        System.out.println("В исходном массиве встречались следующие слова: ");
        for (Map.Entry<String, String> o : noRepeatsArr.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue() + " раз/раза");
        }

    }
    //endregion
}
