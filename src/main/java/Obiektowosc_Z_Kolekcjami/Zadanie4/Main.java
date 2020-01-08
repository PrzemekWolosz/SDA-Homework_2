package Obiektowosc_Z_Kolekcjami.Zadanie4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Inbox> phoneBook = new HashMap<>();
        Phone phone = new Phone(phoneBook);
        phone.addMessageToHistory("123", "Pierwsza wiaodomość od 123");
        phone.addMessageToHistory("456", "Pierwsza wiadomość od 456");
        phone.addMessageToHistory("789", "Pierwsza wiadomość od 789");
        phone.addMessageToHistory("123", "Druga wiadomość od 123");

        phone.removeFirstMessageFromContact("123");
        phone.removeFirstMessageFromContact("123");
        phone.removeFirstMessageFromContact("123");


    }
}
