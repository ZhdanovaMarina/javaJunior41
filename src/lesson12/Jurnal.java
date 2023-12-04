package lesson12;

public class Jurnal extends PrintEdition{

    private int numberOfYear;

    public Jurnal() {
    }

    public Jurnal(String name, int year, int page, String izdatelstvo, int numberOfYear) {
        super(name, year, page, izdatelstvo);
        this.numberOfYear = numberOfYear;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jurnal jurnal = (Jurnal) o;

        return numberOfYear == jurnal.numberOfYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал { Название: " + getName() + ", количество страниц: " + getPage() +
                " номер выпуска: " + numberOfYear + " издательство: " + getIzdatelstvo() +
                " год выпуска: " + getYear() + "}";
    }
}
