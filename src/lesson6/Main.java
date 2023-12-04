package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tours = new String[100][8];
        ToursUtils.addTour("Италия", "Рим", "Самолет", "6 дней",
                "140000 руб.", "4 звезды", "Завтрак", tours);

        ToursUtils.addTour("Италия", "Флоренция", "Самолет", "5 дней",
                "180000 руб.", "4 звезды", "Все включено", tours);

        ToursUtils.addTour("Италия", "Рим", "Самолет", "14 дней",
                "210000 руб.", "5 звезд", "Завтрак", tours);

        ToursUtils.addTour("Франция", "Париж", "Самолет", "6 дней",
                "140000 руб.", "5 звезд", "Завтрак + Ужин", tours);

        ToursUtils.addTour("Германия", "Берлин", "Автобус", "6 дней",
                "175000 руб.", "3 звезды", "Завтрак", tours);

        ToursUtils.addTour("Италия", "Рим", "Самолет", "9 дней",
                "170000 руб.", "4 звезды", "Все включено", tours);

        ToursUtils.addTour("Франция", "Париж", "Самолет", "10 дней",
                "220000 руб.", "4 звезды", "Завтрак", tours);

        ScannerUtils.searchByCountry(tours);
        ScannerUtils.searchByBudget(tours);
        ScannerUtils.searchByDay(tours);
        ScannerUtils.searchByCountryAndPrice(tours);
        ScannerUtils.searchByStarsAndTransport(tours);

        /** 1. Вывести на консоль туры, которые на ... дней. (на сколько дней)
         *  2. Вывести на консоль туры, на ... звезд и ... транспортом.
         *  3. Вывести на консоль туры ... страны и на ... бюджет.
         */
    }
}
