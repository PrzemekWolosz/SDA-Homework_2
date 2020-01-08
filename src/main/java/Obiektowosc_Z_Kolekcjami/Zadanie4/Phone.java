package Obiektowosc_Z_Kolekcjami.Zadanie4;

import java.util.Map;
import java.util.Stack;

public class Phone {

    Map<String, Inbox> phoneBook;

    public Phone(Map<String, Inbox> phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneBook=\n" + phoneBook +
                '}';
    }

    public void addMessageToHistory(String contact, String content) {
        if (phoneBook.containsKey(contact)) {
            phoneBook.get(contact).addMessage(content);
        } else {
            Stack<Message> messageStack = new Stack<>();
            Inbox inbox = new Inbox(messageStack);
            inbox.addMessage(content);
            phoneBook.put(contact, inbox);
        }
    }

    public void printContactMessages(String contact) {
        System.out.println("Inbox of " + contact + ":");
        phoneBook.get(contact).printInbox();

    }

    public Message removeFirstMessageFromContact(String contact) {
        if (phoneBook.get(contact).messageStack.size() > 0) {
            phoneBook.get(contact).removeFirstMessage();
        } else {
            System.out.println("Inbox of contact " + contact + " is empty");
        }
        return phoneBook.get((contact)).messageStack.peek();
    }
}
