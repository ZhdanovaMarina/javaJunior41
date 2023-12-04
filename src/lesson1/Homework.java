package lesson1;

public class Homework {
    public static void main(String[] args) {
        int money = 1000;
        int snickersPrice = 35;
        double candyPrice = 3.5;

        int buySnickers = money / snickersPrice;
        System.out.println(buySnickers);

        int restOfSnickers = money - buySnickers * snickersPrice;

        double buyСandy = restOfSnickers / candyPrice ;
        int buyСandy1 = (int)buyСandy;
        System.out.println(buyСandy1);

        double restOfСandy = buyСandy1 * candyPrice;
        System.out.println(restOfSnickers - restOfСandy);




    }
}
