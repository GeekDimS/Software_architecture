import static java.lang.Math.sqrt;

/**
 * @author DimS on 26.12.2022
 */
public class Triangle extends Shape {
    double lengthA;
    double lengthB;
    double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC) {
        if (checkInput(lengthA, lengthB, lengthC)) {
            this.lengthA = lengthA;
            this.lengthB = lengthB;
            this.lengthC = lengthC;
        } else {
            throw new IllegalArgumentException("Стороны треугольника не могут быть меньше или равны нулю и сумма " +
                    "каждой пары должна быть больше третьей стороны");
        }
    }

    @Override
    void calcPerimeter() {
        this.perimeter = lengthA + lengthB + lengthC;
    }

    @Override
    void calcArea() {
        if (this.perimeter == 0) {
            this.calcPerimeter();
        }
        double hp; // Полупериметр
        hp = this.perimeter / 2;
        this.area = sqrt(hp * (hp - lengthA) * (hp - lengthB) * (hp - lengthC));
    }

    @Override
    boolean checkInput(double... args) {
        return args[1] > 0 && args[0] > 0 && args[2] > 0 && args[0] < (args[1] + args[2]) && args[1] < (args[0] + args[2]) && args[2] < (args[0] + args[1]);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "lengthA=" + lengthA +
                ", lengthB=" + lengthB +
                ", lengthC=" + lengthC +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
