package Obiektowosc_Z_Kolekcjami.Zadanie2;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Client> clientsPriorityQueue = new PriorityQueue<Client>();

        WaitingRoom waitingRoom = new WaitingRoom(clientsPriorityQueue);

        Client client1 = new Client("Adam", true);
        Client client2 = new Client("Franciszka", false);
        Client client3 = new Client("Edward", false);
        Client client4 = new Client("Henryk", true);
        Client client5 = new Client("Amelia", false);

        waitingRoom.addClient(client1.getName(), client1.isPriority());
        waitingRoom.addClient(client2.getName(), client2.isPriority());
        waitingRoom.addClient(client3.getName(), client3.isPriority());
        waitingRoom.addClient(client4.getName(), client4.isPriority());
        waitingRoom.addClient(client5.getName(), client5.isPriority());

        waitingRoom.getAllClients();

    }
}