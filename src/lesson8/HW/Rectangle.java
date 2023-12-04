package lesson8.HW;

public class Rectangle {
    private int a;
    private int b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public Rectangle(int a) {
        this.a = a;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void perimeterOfRectangle(int a, int b) {
        System.out.println((a + b) * 2);
    }

    public void areaOfRectangle(int a, int b) {
        System.out.println(a * b);
    }
}
