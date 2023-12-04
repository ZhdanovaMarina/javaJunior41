package lesson10;

import java.util.Objects;

public class Student extends Object{
    private String fullNAme;
    private int age;
    private int scholarSip;

    public Student() {
    }

    public Student (String fullNAme, int age, int scholarSip){
        this.fullNAme = fullNAme;
        this.age = age;
        this.scholarSip = scholarSip;
    }

    public String getFullNAme() {
        return fullNAme;
    }

    public void setFullNAme(String fullNAme) {
        this.fullNAme = fullNAme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScholarSip() {
        return scholarSip;
    }

    public void setScholarSip(int scholarSip) {
        this.scholarSip = scholarSip;
    }

    @Override
    public boolean equals(Object o) {
        // olya --- o --- student
        // dasha --- this
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        //преобразование типов
        // int a = 9;
        // byte b = (byte) a;
        Student student = (Student) o; //

        if (this.age != student.age)
            return false;
        if (this.scholarSip != student.scholarSip)
            return false;
        return Objects.equals(fullNAme, student.fullNAme);
    }

    @Override
    public int hashCode() {
        int result = fullNAme != null ? fullNAme.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + scholarSip;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullNAme='" + fullNAme + '\'' +
                ", age=" + age +
                ", scholarSip=" + scholarSip +
                '}';
    }
}
