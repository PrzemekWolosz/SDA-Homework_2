package Lista;


import java.util.NoSuchElementException;

public class MyLinkedList<T> {
    private int size;
    private Node head;

    public MyLinkedList() {
        this.size = 0;
    }

    public void addAt(T valueToAdd, int index) {
        Node newNode = new Node(valueToAdd);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + " is either too low or to big for that list");
        }
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.getNext();
        }
        Node pre = tmp;
        Node after = tmp.getNext();
        newNode.setNext(after);
        pre.setNext(newNode);
    }

    public void addLast(T valueToAdd) {
        Node newNode = new Node(valueToAdd);

        if (isEmpty()) {
            this.head = newNode;
        } else {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
        size++;
    }

    public void addFirst(T valueToAdd){
        Node newNode = new Node(valueToAdd);
        if (isEmpty()){
            this.head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + " is either too low or to big for that list");
        }
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.getNext();
        }
        Node del = tmp.getNext();
        Node after = del.getNext();
        tmp.setNext(after);
    }

    public void removeFirst(){
        if (isEmpty()) {
            throw new NoSuchElementException("Lista jest pusta");
        } else {
            Node temp = head;
            head = head.getNext();
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            throw new NoSuchElementException("Lista jest pusta");
        } else {
            Node pre = head;
            Node tmp = head.getNext();
            while (tmp.getNext() != null) {
                pre = tmp;
                tmp = tmp.getNext();
            }
            pre.setNext(null);
        }
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + " is either too low or to big for that list");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return (T) tmp.getValue();
    }

    public void setAt(int index, T valueToAdd) {
        Node newNode = new Node(valueToAdd);
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + " is either too low or to big for that list");
        }
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.getNext();
        }
        Node pre = tmp;
        Node after = tmp.getNext();
        newNode.setNext(after);
        pre.setNext(newNode);
        Node nextAfter = after.getNext();
        newNode.setNext(nextAfter);
    }

    public boolean isEmpty() {
        if (size >= 1) {
            return false;
        } else {
            return true;
        }
    }

    public int size() {
        size = 1;
        if (isEmpty()) {
            return 0;
        } else {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                size++;
            }
        }
        return size;
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Lista jest pusta");
        }
        return (T) head.getValue();
    }

    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Lista jest pusta");
        }
        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        return (T) tmp.getValue();
    }

    public void clear(){
        head = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyLinkedList{");

        if (head != null) {
            sb.append(head.getValue());

            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
                sb.append(", " + tmp.getValue());
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
