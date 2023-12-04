package lesson3;

public class Homework5 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";
        String backtext = new StringBuilder(text).reverse().toString();
        System.out.println(backtext);
    }
}
