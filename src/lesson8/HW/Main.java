package lesson8.HW;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------Треугольник--------");
        Triangle perimetr = new Triangle(5,5,5);
        Triangle area = new Triangle(2,2);
        perimetr.perimeterOfTriangle(5,5,5);
        area.areaOfTriangle(2,2);

        System.out.println("--------Прямоугольник--------");
        Rectangle perimetr1 = new Rectangle(5,5);
        Rectangle area1 = new Rectangle(2,2);
        perimetr1.perimeterOfRectangle(5,5);
        area1.areaOfRectangle(2,2);

        System.out.println("--------Квадрат--------");
        Square perimetr2 = new Square(5);
        Square area2 = new Square(5);
        perimetr2.perimeterOfSquare(5);
        area2.areaOfSquare(5);

        System.out.println("--------Круг--------");
        Circle perimetr3 = new Circle(5);
        Circle area3 = new Circle(10);
        perimetr3.perimeterOfCircle(10);
        area3.areaOfCircle(5);

        System.out.println("--------Овал--------");
        Oval perimetr4 = new Oval(5);
        Oval area4 = new Oval(5,5);
        perimetr4.perimeterOfOval(5,5);
        area4.areaOfOval(5,5);
    }



}
