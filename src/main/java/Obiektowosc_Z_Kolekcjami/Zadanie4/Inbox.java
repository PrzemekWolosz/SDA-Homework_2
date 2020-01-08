package Obiektowosc_Z_Kolekcjami.Zadanie4;

import java.util.Stack;

public class Inbox {

    Stack<Message> messageStack;

    public Inbox(Stack<Message> messageStack) {
        this.messageStack = messageStack;
    }

    public void addMessage(String content) {
        Message message = new Message(content);
        messageStack.push(message);
    }

    public Message removeFirstMessage() {
        System.out.print("Removed: " + messageStack.peek());
        return messageStack.pop();
    }

    public void printInbox() {
        do {
            System.out.print(messageStack.pop());
        } while (messageStack.size() > 0);
    }

    @Override
    public String toString() {
        return "Inbox: " +
                "messageStack=" + messageStack +
                "\n";
    }
}
