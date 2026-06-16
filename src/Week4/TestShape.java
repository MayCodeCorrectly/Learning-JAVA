package Week4;

abstract class Shape {
    // this is abstract method that every class which extends shape should implement necessarily
    public abstract double perimeter();

}

class Square extends Shape{
    private double side;

    Square(double side){
        this.side = side;
    }

    public void setSide(double s){
        side = s;
    }
    public double getSide(){
        return this.side;
    }

    @Override
    public double perimeter(){
        return  4*getSide();
    }
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter(){
        return 2*Math.PI*getRadius();
    }
}

public class TestShape{
    public static void main() {
        Shape s1 = new Circle(4.5);
        System.out.println(s1.perimeter());
        // I can not use getRadius or setRadius on s1 cause at static checking will not allow it

        Circle c1 = new Circle(8.2);
        c1.setRadius(9.1);
        System.out.println(c1.perimeter());
    }
}