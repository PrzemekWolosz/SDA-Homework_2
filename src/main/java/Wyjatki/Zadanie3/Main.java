package Wyjatki.Zadanie3;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Adam", "Kowalski", 36);
        Person person2 = new Person("Ola", "Nowak", 16);

        Club club = new Club();
        club.enter(person1);
        club.enter(person2);

    }
}
