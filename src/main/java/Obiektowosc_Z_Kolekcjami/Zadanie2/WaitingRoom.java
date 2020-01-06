package Obiektowosc_Z_Kolekcjami.Zadanie2;

import java.util.PriorityQueue;

public class WaitingRoom {

    PriorityQueue<Client> clientPriorityQueue;

    public WaitingRoom(PriorityQueue<Client> clientPriorityQueue) {
        this.clientPriorityQueue = clientPriorityQueue;
    }

    public void addClient(String name, boolean isPriority) {
        Client client = new Client(name, isPriority);
        clientPriorityQueue.add(client);
    }

    public Client getClient() {
        return clientPriorityQueue.peek();
    }

    public void getAllClients() {
        do {
            System.out.println(clientPriorityQueue.peek());
            clientPriorityQueue.remove();
        } while (clientPriorityQueue.size() > 0);
    }
}
