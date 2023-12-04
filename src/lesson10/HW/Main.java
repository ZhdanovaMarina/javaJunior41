package lesson10.HW;

public class Main {
    public static void main(String[] args) {

        LibraryCatalog libraryCatalog = new LibraryCatalog();

        Books book1 = new Books("Анна Каренина, ", "Лев Толстой, ", 2023,
                800, "Эксмо");
        Magazines magazines1 = new Magazines("Лиза, ", 2021, 16,
                "Издательский дом Бурда АО");
        Books book2 = new Books("Сергей Есенин.Стихотворения, ", "Сергей Есенин, ", 2019,
                288, "Эксмо");
        Books book3 = new Books("Джейн Эйр, ", "Шарлотта Бронте, ", 2022,
                544, "Эксмо");
        Magazines magazines2 = new Magazines("Азбука вязания, ", 2020, 7,
                "Газетный мир");
        Magazines magazines3 = new Magazines("Тайны звезд, ", 2023, 45,
                "Bauer Media Group");

        libraryCatalog.addBook(book1);
        libraryCatalog.addMagazin(magazines1);
        libraryCatalog.addBook(book2);
        libraryCatalog.addBook(book3);
        libraryCatalog.addMagazin(magazines2);
        libraryCatalog.addMagazin(magazines3);

        libraryCatalog.displayMagazines();
        libraryCatalog.displayBooks();
    }

}
