package lesson8.HW;

public class Oval {
    private int a; // большая полуось
    private int b; // меньшая полуось

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

    public Oval(int a, int b){
        this.a = a;
    }
    public Oval(int b){
        this.b = b;
    }
    public void areaOfOval(int a, int b){
        System.out.println(3.14 * a * b);
    }
    public void perimeterOfOval(int a, int b){
        System.out.println(4 * ((3.14 * a * b +(a - b)) / (a + b)));
    }
}
