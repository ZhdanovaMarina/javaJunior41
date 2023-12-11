package lesson13;

public class Main {
    public static void main(String[] args) {
        double[][] numsForA = {{3, 6, 7, 8},
                               {8, 7, 6, 8},
                               {5, 5, 6, 8}};
        Matrix a = new Matrix(numsForA);
        System.out.println(a.getRows());
        System.out.println(a.getColumns());
        System.out.println(a.getValueAt(0,0));
        a.setValueAt(0,0, 9);
        System.out.println(a.getValueAt(0,0));

        double[][] numsForB = {{6, 6, 6, 7},
                               {5, 5, 5, 6},
                               {4, 4, 4, 5}};
        Matrix b = new Matrix(numsForB);

        // неявный параметр - это a (внутри метода доступно по this)
        // явный параметр - это b (внутри метода доступно otherMatrix)
        IMatrix resultAdd = a.add(b);
        a.printToConsole();
        System.out.println("------------------------");

        resultAdd.printToConsole();
        System.out.println("------------------------");

        IMatrix resultSub = a.sub(b);
        resultSub.printToConsole();
        System.out.println("------------------------");

        double[][] numsForC = {{3, 5, 7},
                               {1, 3, 6},
                               {2, 4, 6}};
        lesson13.Matrix c = new lesson13.Matrix(numsForC);

        double[][] numsForD = {{6, 6, 6},
                               {5, 5, 5},
                               {4, 4, 4}};
        lesson13.Matrix d = new lesson13.Matrix(numsForD);

        System.out.println("Матрица 'C' УМНОЖИТЬ матрица 'D' =");
        IMatrix resultMull = c.mul(d);
        resultMull.printToConsole();

        System.out.println("Матрицу 'C' умножить на 3 =");
        c.mul(3).printToConsole();

        System.out.println("Транспонированная Матрица 'C' =");
        c.transpose().printToConsole();

        System.out.println("Заполняет Матрицу 'B' числом 1.0 =");
        b.fillMatrix(1);
        b.printToConsole();

        System.out.println("Проверяет является ли Матрица 'C' нулевой  =");
        boolean result = c.isNullMatrix();
        System.out.println(result);

        System.out.println("Проверяет является ли Матрица 'F' единичной  =");
        double[][] numsForF = {{1, 0, 0},
                               {0, 1, 0},
                               {0, 0, 1}};
        lesson13.Matrix f = new lesson13.Matrix(numsForF);
        boolean result1 = f.isIdentityMatrix();
        System.out.println(result1);

        System.out.println("Проверяет является ли Матрица 'B' квадратной  =");
        boolean result2 = b.isSquareMatrix();
        System.out.println(result2);

        System.out.println("Проверяет является ли Матрица 'C' квадратной  =");
        c.isSquareMatrix();

        System.out.println("Детерминант матрицы 'X' =");
        double[][] numsForX = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        lesson13.Matrix x = new lesson13.Matrix(numsForX);
        System.out.println(x.determinant());

        System.out.println("Детерминант матрицы 'Y' =");
        double[][] numsForY = {{12, 1, 7},
                {5, 8, 10},
                {2, 4, 3}};
        lesson13.Matrix y = new lesson13.Matrix(numsForY);
        System.out.println(y.determinant());

        System.out.println("Детерминант матрицы 'Z' =");
        double[][] numsForZ = {{12, 1, 7, 0},
                {5, 8, 10, 0},
                {2, 4, 3, 0},
                {0, 0, 0, 0}};
        lesson13.Matrix z = new Matrix(numsForZ);
        System.out.println(z.determinant());
    }
}
