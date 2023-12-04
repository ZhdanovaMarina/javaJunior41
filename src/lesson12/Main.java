package lesson12;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] editions = new PrintEdition[6];
        editions[0] = new Book("Война и мир", 1950, 450, "Россия", "Лев Толстой");
        editions[1] = new Book("Шекспир", 1999, 1100, "Эксмо", "Пушкин");
        editions[2] = new Book("Аврора", 2017, 450, "Россия", "Лермонтов");
        editions[3] = new Jurnal("Бурда", 2010, 20, "Россия", 5);
        editions[4] = new Jurnal("Натали", 2023, 51, "Россия", 1);
        editions[5] = new Jurnal("Звезды", 2015, 32, "Россия", 10);

        for (PrintEdition currentEdition:editions){ // сокращ. вариант (for each)
            System.out.println(currentEdition.toString()); //проявление полиморфизма
        }

        printBigestEdition(editions);
    }
    /** Полиморфизм - это свойство Джава, работать с РАЗНЫМИ типами данных
     * как с ОДИНАКОВЫМ типом. Но в то же самое время в момент выполнения программы
     * программа будет работать как с РАЗНЫМИ типами.
     *
     */

    public static void printBigestEdition (PrintEdition[] editions){
        //
    }

}