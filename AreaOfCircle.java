import java.lang.Math;

class Circle{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    double getCircumference(){
        double circumference = Math.PI * radius * radius;
        System.out.printf("Circumference of the circle is %.2f", circumference);
        return circumference;
    } 
}

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius = 3;
        Circle circle = new Circle(radius);
        circle.getCircumference();
    }
}