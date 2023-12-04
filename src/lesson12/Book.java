package lesson12;

import java.util.Objects;

public class Book extends PrintEdition{
    private String avtor;

    public Book() {
    }

    public Book(String name, int year, int page, String izdatelstvo, String avtor) {
        super(name, year, page, izdatelstvo);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return Objects.equals(avtor, book.avtor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Книга { Название: " + getName() + ", количество страниц: " + getPage() +
                " автор: " + avtor + " издательство: " + getIzdatelstvo() + " год выпуска: " +
                getYear() + "}";
    }
}
