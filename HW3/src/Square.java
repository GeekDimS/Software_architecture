/**
 * @author DimS on 26.12.2022
 */
public class Square extends Shape {
    double length;

    public Square(double length) {
        if (checkInput(length)) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Сторона квадрата не может быть меньше или равна нулю");
        }
    }

    @Override
    void calcPerimeter() {
        this.perimeter = this.length * 4;
    }

    @Override
    void calcArea() {
        this.area = this.length * this.length;
    }

    @Override
    boolean checkInput(double... args) {
        return args[0] > 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
