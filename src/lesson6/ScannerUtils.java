package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    public static void searchByCountry(String[][] tours) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать?");
        String country = skaner.next();
        System.out.println(" ----------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByCountry(tours, country);
        System.out.println(" ---------------------");
    }

    // поиск туров по бюджету(пользователь задает одно число, и мы печатаем туры +- 20т от этого бюджета)

    public static void searchByBudget(String[][] tours) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("На какой бюджет распологаете?");
        int budget = skaner.nextInt();
        System.out.println(" ----------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println(" ---------------------");

    }

    public static void searchByDay(String[][] tours) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("На сколько дней планируете отдых?");
        int day = skaner.nextInt();
        System.out.println(" ----------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByDay(tours, day);
        System.out.println(" ---------------------");
    }

    public static void searchByCountryAndPrice(String[][] tours) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать и на какой бюджет распологаете?");
        String country = skaner.next();
        int price = skaner.nextInt();
        System.out.println(" ----------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByCountryAndPrice(tours, country, price);
        System.out.println(" ---------------------");

    }

    public static void searchByStarsAndTransport(String[][] tours) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Какой транспорт предпочитаете и какой отель?");
        String transport = skaner.next();
        int stars = skaner.nextInt();
        System.out.println(" ----------РЕЗУЛЬТАТ-------");
        ToursUtils.printToursByStarsAndTransport(tours, transport, stars);
        System.out.println(" ---------------------");
    }
}
