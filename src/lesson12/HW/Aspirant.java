package lesson12.HW;

import java.util.Objects;

public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        return Objects.equals(scientificWork, aspirant.scientificWork);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (scientificWork != null ? scientificWork.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Аспирант: {" + "Имя и Фамилия: " + getFirstName()+ " " + getLastName() +
                " , группа №: " + getGroup() + ", средний балл: " + getAverageMark() + ", научная работа: " +
                scientificWork +
                '}';
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5){
            return 2500;
        } else {
            return 2200;
        }
    }
}
