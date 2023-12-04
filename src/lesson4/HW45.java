package lesson4;

public class HW45 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";
        String[] words = text.split(" ");
// Напечатать на консоль каждое слово в отдельной строке
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
//Напечатать на консоль каждое слово в обратном порядке
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }


    }
}
