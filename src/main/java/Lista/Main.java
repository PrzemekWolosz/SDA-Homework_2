package Lista;

public class Main {
    public static void main(String[] args) {

        MyLinkedList mojaLista = new MyLinkedList();
        System.out.println(mojaLista.toString());

        mojaLista.addLast("aaa");
        mojaLista.addLast(1.7675);
        mojaLista.addLast(true);
        mojaLista.addLast("ddd");
        mojaLista.addLast(500);
        mojaLista.addLast('a');

        System.out.println(mojaLista.toString());

        mojaLista.setAt(3,1111);

        System.out.println(mojaLista.toString());

    }
}
