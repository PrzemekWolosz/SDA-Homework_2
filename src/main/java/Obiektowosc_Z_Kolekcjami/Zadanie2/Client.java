package Obiektowosc_Z_Kolekcjami.Zadanie2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client implements Comparable<Client> {

    private String name;
    private LocalDateTime arrivalTime;
    private boolean isPriority;

    public Client(String name, boolean isPriority) {
        this.name = name;
        this.arrivalTime = LocalDateTime.now();
        this.isPriority = isPriority;
    }

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM HH:mm:ss");

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", arrivalTime=" + arrivalTime.format(formatter) +
                ", isPriority=" + isPriority +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public boolean isPriority() {
        return isPriority;
    }

    @Override
    public int compareTo(Client c) {
        if (isPriority && !c.isPriority)
            return -1;
        if (!isPriority && c.isPriority)
            return 1;
        if (arrivalTime.isBefore(c.arrivalTime))
            return -1;
        if (arrivalTime.isAfter(c.arrivalTime))
            return 1;
        return 0;
    }
}
