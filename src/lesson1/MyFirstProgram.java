package lesson1; //package - указание в какой папке находится файл

// public - общедоступный (открытый)
// class - кусочек java-кода с одной смысловой нагрузкой

public class MyFirstProgram {

// точка начала программы. Код внутри будет отработан.
    public static void main(String[] args) {
        // форматирование кода ctrl + Alt + L
       int a = 3;
       int b = 4;
       int c = 5;

     int perimetrOfTriangle = a + b + c;

        System.out.println(perimetrOfTriangle);

    }

}
