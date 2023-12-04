package lesson12.HW;

public class Main {
    public static void main(String[] args) {

        Student[] student = new Student[4];
        student[0] = new Student("Антон", "Пупков", "421А", 4.6);
        student[1] = new Aspirant("Тимур", "Кабачков", "421А", 5, "Пришельцы среди нас.");
        student[2] = new Student("Виктория", "Зайцева", "226B", 5);
        student[3] = new Aspirant("Евгения", "Трусова", "18Г", 3.2, "Загадки млечного пути.");

        for (Student currentStudent:student){
            System.out.println(currentStudent.getScholarship());
        }
    }
}
