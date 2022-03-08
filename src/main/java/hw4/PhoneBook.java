package hw4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, ArrayList> phoneBook = new HashMap<>();

    public void add(String firstName, String phoneNumber) {
        ArrayList<String> phoneNumbersList = new ArrayList<>();
        if (phoneBook.containsKey(firstName)) {
            phoneNumbersList = phoneBook.get(firstName);
        }
        phoneNumbersList.add(phoneNumber);
        phoneBook.put(firstName, phoneNumbersList);
    }
    public ArrayList<String> get (String firstName) {
        return phoneBook.get(firstName);
    }

}
