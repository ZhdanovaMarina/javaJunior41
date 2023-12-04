package lesson8.HW;

public class Square {
    private int a;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Square(int a){
        this.a = a;
    }
    public void perimeterOfSquare(int a){
        System.out.println(a * 4);
    }
    public void areaOfSquare (int a){
        System.out.println(a * a);
    }
}
