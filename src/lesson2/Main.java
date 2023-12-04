package lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int money = 1000;
       int costOfSnikers = 35;
       double costOfCandy = 3.5;

       int countCanSnikBy = money / costOfSnikers; // 28 шт
       int rest = money % costOfSnikers; // 20 рубл сдача
        // 2 вида преобразования:
        // вниссходящий
        // вверхсходящий
       int countCanCandyBy = (int)(rest / costOfCandy);
       double totalRest = rest - (countCanCandyBy * costOfCandy);

        System.out.println(countCanSnikBy);
        System.out.println(countCanCandyBy);
        System.out.println(totalRest);


    }
}
