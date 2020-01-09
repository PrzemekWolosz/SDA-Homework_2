package Rekurencja.OdwroconyNapis;

public class Main {
    public static void main(String[] args) {
        String text = "Super";
        System.out.println(reverse(text));
    }

    private static String reverse(String text) {
        if (text.isEmpty()) {
            return text;
        } else {
            return text.substring(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
        }
    }
}