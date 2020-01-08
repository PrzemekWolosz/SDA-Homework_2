package Wyjatki.Zadanie3;

public class Club {

    public void enter(Person person) {
        if (person.getAge() < 18) {
            throw new NoAdultExeption("You can't come in! You are underage");
        } else {
            System.out.println("Come in");
        }
    }
}
