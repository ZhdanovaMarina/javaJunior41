package lesson13;

public class Matrix implements IMatrix {
    private double[][] nums;

    public Matrix() {
        nums = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        nums = new double[row][col];
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит!");
            return 0;
        }
        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("rowIndex не подходит!");
            return 0;
        }
        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит!");
            return;
        }

        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("rowIndex не подходит!");
            return;
        }

        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // неявный параметр - это a === this (внутри метода доступно по this)
        // явный параметр - это b === otherMatrix (внутри метода доступно otherMatrix)

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает количество колонок!");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает количество колонок!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Количество колонок не равно количеству строк!!");
            return null;
        }
        IMatrix resultMatrix = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
            double sum = 0;
            for (int k = 0; k < this.getColumns(); k++) {
                sum += getValueAt(i, k) * otherMatrix.getValueAt(k, j);
            }
            resultMatrix.setValueAt(i, j, sum);
            }
        }
        return resultMatrix;

    }


    @Override
    public IMatrix mul(double value) {
        IMatrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i =0; i< this.getRows(); i++){
            for (int j = 0; j < this.getColumns(); j++){
                result.setValueAt(i, j, this.getValueAt(i,j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() { // перевернутая матрица
        Matrix result = new Matrix(this.getColumns(), this.getRows());

        for (int i =0; i < this.getRows(); i++){
            for (int j = 0; j < this.getColumns(); j++){
                result.setValueAt(j, i, this.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++){
            for (int j = 0; j < this.getColumns(); j++){
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() { // найти в инете
        if (!isSquareMatrix()) {
            throw new UnsupportedOperationException("Determinant can only be calculated for square matrices");
        }

        int n = this.getRows();
        if (n == 1) {
            return this.getValueAt(0, 0);
        } else if (n == 2) {
            return this.getValueAt(0, 0) * this.getValueAt(1, 1) - this.getValueAt(0, 1) * this.getValueAt(1, 0);
        } else {
            double det = 0;
            for (int i = 0; i < n; i++) {
                det += this.getValueAt(0, i) * cofactor(0, i).determinant() * ((i % 2 == 0) ? 1 : -1);
            }
            return det;
        }
    }
    // Helper method to compute the cofactor matrix
    private IMatrix cofactor(int row, int col) {
        training.Matrix cofactorMatrix = new training.Matrix(this.getRows() - 1, this.getColumns() - 1);
        int rowCount = 0;
        for (int i = 0; i < this.getRows(); i++) {
            if (i == row) {
                continue;
            }
            int colCount = 0;
            for (int j = 0; j < this.getColumns(); j++) {
                if (j == col) {
                    continue;
                }
                cofactorMatrix.setValueAt(rowCount, colCount, this.getValueAt(i, j));
                colCount++;
            }
            rowCount++;
        }
        return cofactorMatrix;
    }


    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (this.getRows() != this.getColumns()) {
            return false; // Not a square matrix, so it cannot be an identity matrix
        }

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if ((i == j && this.getValueAt(i, j) != 1) || (i != j && this.getValueAt(i, j) != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        // this - та матрица,которую надо напечатать

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }


}
