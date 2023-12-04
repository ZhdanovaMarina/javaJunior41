package lesson2;

public class Main6 {
    public static void main(String[] args) {

        // Сколько денег мы вынесем с банка, если положим
        // 10 млн на 15 лет под депозит 13% годовых
        // капитализация каждый месяц

        int money = 10000000;
        for (int month = 0; month < 15 * 12; month++ ){
            money = money + ((money / 100 * 13) / 12);
        }
        System.out.println(money);

    }
}
