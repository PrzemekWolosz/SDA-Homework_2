package Obiektowosc_Z_Kolekcjami.Zadanie4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

    private String content;
    private LocalDateTime date;

    public Message(String content) {
        this.content = content;
        this.date = LocalDateTime.now();
    }

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" dd-MM-yyyy HH:mm:ss");

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", date=" + date.format(formatter) +
                "}\n";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
