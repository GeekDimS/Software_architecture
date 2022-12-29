import static java.lang.Math.PI;

/**
 * @author DimS on 26.12.2022
 */
public class Circle extends Shape{
    double radius;
    double circumference;
    public Circle(double radius) {
        if(checkInput(radius)){
            this.radius = radius;
        }
        else {
            throw new IllegalArgumentException("Круг не может иметь радиус меньше или равным нулю");
        }

    }

    @Override
    void calcPerimeter() {
        /*calcCircumference();*/;
    }

    @Override
    void calcArea() {
        this.area = PI * radius * radius;
    }

    @Override
    boolean checkInput(double ... args) {
        return args[0] > 0;
    }

    void  calcCircumference(){
        this.circumference = 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + " nothing" +
                ", area=" + area +
                '}';
    }
}
