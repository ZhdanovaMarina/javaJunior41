package lesson8.HW;

public class Circle {
    private int r; //радиус


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    public Circle (int r){
        this.r = r;
    }


    public void perimeterOfCircle(int r){
        System.out.println(2 * 3.14 * r);
    }
    public void areaOfCircle(int r){
        System.out.println(3.14 * (r * r));
    }
}
