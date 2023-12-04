package lesson5;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /** Программа будет просить пользователя ввести с консоли фигуру
         * (треугольник, квадрат, овал, круг,трапеция)
         * Потом мы пользователя просим ввести нужные данные о фигуре (сторона, высота и т.д.)
         * И на основании введенных данных печатаем на консоль площадь и периметр
         */

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Овал");
        System.out.println("4 - Круг");
        System.out.println("5 - Трапеция");

// считывание с клавиатуры (System.in)
        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.next(); // число или слово

        if (inputFigura.equals("1") || inputFigura.equalsIgnoreCase("треугольник")) { // если выбрали треугольник
            System.out.println("Введите сторону а:");
            int a = scanner.nextInt();
            System.out.println("Введите сторону b:");
            int b = scanner.nextInt();
            System.out.println("Введите сторону c:");
            int c = scanner.nextInt();

            System.out.println("Площадь треугольника:");
            MathUtils.squareTriangle(a, b, c);
            System.out.println("Периметр треугольника:" + MathUtils.perimetrTriangle(a, b, c));

        }
        if (inputFigura.equals("2") || inputFigura.equalsIgnoreCase("квадрат")) {
            System.out.println("Введите сторону a:");
            int a = scanner.nextInt();
            System.out.println("Площадь квадрата:");
            MathUtils.squareKvadrat(a);
            System.out.println("Периметр квадрата:" + MathUtils.perimetrKvadrata(a));
        }
        if (inputFigura.equals("4") || inputFigura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус");
            int r = scanner.nextInt();

            System.out.println("Площадь круга:");
            MathUtils.squareCircle(r);
            System.out.println("Периметр круга:");
            MathUtils.perimetrCircle(r);

        }
        if (inputFigura.equals("5") || inputFigura.equalsIgnoreCase("трапеция")){
            System.out.println("Введите первое основание трапеции а:");
            int a = scanner.nextInt();
            System.out.println("Введите второе основание трапеции b:");
            int b = scanner.nextInt();
            System.out.println("Введите высоту трапеции h:");
            int h = scanner.nextInt();
            System.out.println("Введите длину стороны q:");
            int q = scanner.nextInt();
            System.out.println("Введите длину стороны w:");
            int w = scanner.nextInt();
            System.out.println("Введите длину стороны e:");
            int e = scanner.nextInt();
            System.out.println("Введите длину стороны r:");
            int r = scanner.nextInt();

            System.out.println("Площадь трапеции:");
            MathUtils.squareTrapezoid(a,b,h);
            System.out.println("Периметр трапеции:");
            MathUtils.perimetrTrapezoid(q,w,e,r);
        }
        if (inputFigura.equals("3") || inputFigura.equalsIgnoreCase("овал")){
            System.out.println("Введите длинну большой полуоси а:");
            int a = scanner.nextInt();
            System.out.println("Введите длинну малой полуоси b:");
            int b = scanner.nextInt();

            System.out.println("Периметр овала:");
            MathUtils.perimetrOvala(a, b);
            System.out.println("Площадь овала:");
            MathUtils.squareOvala(a,b);
        }


    }
}
