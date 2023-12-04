package lesson10.HW;

public class Magazines {
    private String name;
    private int yearOfPublishing;
    private int numberInYear;
    private String publishingHouse;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberInYear() {
        return numberInYear;
    }

    public void setNumberInYear(int numberInYear) {
        this.numberInYear = numberInYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }


    public Magazines(String name, int yearOfPublishing, int numberInYear, String publishingHouse) {
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
        this.numberInYear = numberInYear;
        this.publishingHouse = publishingHouse;
    }

    public void displayMagazin() {
        System.out.println("Название журнала: " + getName() + "год публикации: " + getYearOfPublishing() +
                ", " + "номер журнала: " + getNumberInYear() + ", " + "издательство: " + getPublishingHouse());
    }
}
