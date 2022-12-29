/**
 * @author DimS on 26.12.2022
 */
public abstract class Shape {
    protected double perimeter = 0;
    protected double area = 0;

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    abstract void calcPerimeter();
    abstract void calcArea();
    abstract boolean checkInput(double ... args);

    @Override
    public String toString() {
        return "Shape{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
