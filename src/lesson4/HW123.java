package lesson4;

public class HW123 {
    public static void main(String[] args) {
        int [] massive = {3, 5, 8, 3, 55, 54, 1, 65, 36, 98};
// Вывести на консоль через ячейку
        for (int i = 0; i < massive.length; i = i + 2){
            System.out.println(massive[i]);
        }
//Вывести на консоль массив с обратной стороны
        for (int i = massive.length - 1; i >=0; i --){
            System.out.println(massive[i]);
        }
//Вывести на консоль те числа, которые содержат символ 5
        for (int i =0; i < massive.length; i++){
            //Нужно преобразовать число в ряд символов
            //Конкатенация строк = склеивание текста
            String currentNumFromMassive = massive[i] + ""; // 3 --> "3"
            if (currentNumFromMassive.contains("5")){
                System.out.println(currentNumFromMassive);
            }

        }


    }
}
