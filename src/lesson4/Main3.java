package lesson4;

public class Main3 {
    public static void main(String[] args) {
        // Напечатать на консоль главную диагональ ровного квадрата 8*8
        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (i + j == nums.length -1){ // Обратная диагональ
                    System.out.print(nums[i][j] + " ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}
