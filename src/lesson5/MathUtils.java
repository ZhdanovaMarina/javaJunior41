package lesson5;

public class MathUtils {

    /**
     * // создание метода
     * 1 - модификатор доступа (слово, определяющее область видимости)
     * public - доступен внутри всего проекта
     * protected - доступен только внутри текущей папки, и наследником текущего класса
     * ________ - доступен только внутри текущей папки
     * private - доступ только в этом классе
     * <p>
     * Где можно ставить модицикатор доступа:
     * - перед классом
     * - перед методом (там, где создаете метод)
     * -
     * -
     * 2 - static (пишем или не пишем)
     * 3 - указываем возвращаемый тип (или слово void если оно отсутствует)
     * 4 - название метода (максимально корректно)
     * 5 - входящие параметры (то, без чего невозможно выполнить метод)
     * Всегда записываются в (), через запятую, указывая тип и название переменной
     * 6 - тело выполнения данного метода, данной команды
     */

    // Задача: создать метод, который посчитает площадь треугольника по 3м сторонам и выведет ее на консоль
    public static void squareTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    // Метод возвращает на консоль периметр треугольника по 3м сторонам
    public static int perimetrTriangle(int a, int b, int c) {
        return a + b + c;
    }

    //Метод возвращает на консоль площадь квадрата по стороне
    public static void squareKvadrat(int a) {
        System.out.println(a * a);
    }

    // Mетод возвращает на консоль периметр квадрата
    public static int perimetrKvadrata(int a) {
        return (a * 4);
    }

    //Метод возвращает на консоль площадь круга через радиус
    public static void squareCircle(int r) {
        System.out.println(3.14 * (r * r));
    }
    // Метод возвращает на консоль периметр круга
    public static void perimetrCircle (int r){
        System.out.println(2 * 3.14 * r);
    }
    // Метод возвращает на консоль площадь трапеции (через основания и высоту)
    public static void squareTrapezoid (int a, int b, int h){
        double s = ((a + b) / 2) * h;
        System.out.println(((a + b) / 2.0) * h);
    }
    // Метод возвращает на консоль периmетр трапеции
    public static void perimetrTrapezoid (int q, int w, int e, int r) {
        System.out.println(q * w * e * r);
    }
    // Метод возвращает на консоль периметр овала
    public static void perimetrOvala (int a, int b){
        System.out.println((4 * (3.14 * a * b) + (a - b)) / (a + b));
    }
    // Метод возвращает на консоль площадь овала
    public static void squareOvala (int a, int b){
        System.out.println(3.14 * a * b);
    }

}
