package lesson1;

public class Main1 {
    public static void main(String[] args) {

        int tableWidth = 3; // ширина стола
        int tableLength = 5; // длина стола
        int roomWidth = 34; // ширина комнаты
        int roomLength = 25; // длина комнаты

        int tableArea = tableWidth * tableLength;
        int roomArea = roomWidth * roomLength;

        int tablesToInsertToRoom = roomArea / tableArea;

        System.out.println(tablesToInsertToRoom);


    }
}
