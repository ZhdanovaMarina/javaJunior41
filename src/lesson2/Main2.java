package lesson2;

public class Main2 {
    public static void main(String[] args) {
        // Есть 3 стороны треугольника, нужно вывести: разносторонний, равносторонний или равнобедренный.

        // Управляющая конструкция if else

        int a = 7;
        int b = 7;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if ((a == b && b != c && c != a) || (a != b && b != c && c == a) || (a != b && b == c && c != a)) {
            System.out.println("Это равнобедренный треугольник");
        }


    }
}
