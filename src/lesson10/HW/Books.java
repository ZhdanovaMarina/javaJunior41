package lesson10.HW;

public class Books {
    private String name;
    private String author;
    private int yearOfPublishing;
    private int howManyPages;
    private String publishingHouse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getHowManyPages() {
        return howManyPages;
    }

    public void setHowManyPages(int howManyPages) {
        this.howManyPages = howManyPages;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Books(String name, String author, int yearOfPublishing, int howManyPages, String publishingHouse) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.howManyPages = howManyPages;
        this.publishingHouse = publishingHouse;
    }

    public void displayBook(){
        System.out.println("Название книги: " + getName() + "автор: " + getAuthor() +
                "год публикации: " + getYearOfPublishing() + ", " + "количество страниц: " +
                getHowManyPages() + ", " + "издательство: "  + getPublishingHouse());
    }
}
