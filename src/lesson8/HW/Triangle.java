package lesson8.HW;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private int h;

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int c, int h) {
        this.c = c;
        this.h = h;
    }

    public void perimeterOfTriangle(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public void areaOfTriangle(int c, int h) {
        System.out.println(0.5 * c * h);
    }
}
