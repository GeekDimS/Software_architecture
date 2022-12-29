/**
 * @author DimS on 26.12.2022
 */
public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width) {
        if(checkInput(length, width)){
            this.length = length;
            this.width = width;
        }
        else {
            throw new IllegalArgumentException("Стороны прямоугольника не могут быть меньше или равны нулю");
        }

    }

    @Override
    void calcPerimeter() {
        this.perimeter = 2 * this.length + 2 * this.width;
    }

    @Override
    void calcArea() {
        this.area = this.length * this.width;
    }

    @Override
    boolean checkInput(double... args) {
        return args[0] > 0 && args[1] > 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
