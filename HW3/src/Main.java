import java.util.ArrayList;
import java.util.List;

/**
 * @author DimS on ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        // Создаем переменную массива
        List<Shape> arrShape = new ArrayList<>();
        // Наполнение массива - создание новых объектов
        arrShape.add(new Circle(2));
        arrShape.add(new Rectangle(4,2));
        arrShape.add(new Square(3));
        arrShape.add(new Triangle(3,4,5));

        // Расчёт периметра и площади фигур
        for (Shape item: arrShape) {
            item.calcPerimeter();
            item.calcArea();
        }

        // Вывод информации о каждой фигуре в массиве
        for (Shape item: arrShape) {
            System.out.println(item.toString());
        }

//        Shape shape = );
//        shape.calcPerimeter();
//        shape.calcArea();
//        System.out.println(shape.toString());

//        Shape shape1;
//        try {
//            shape1 = new Circle(1);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        shape1.calcPerimeter();
//        shape1.calcArea();
//        System.out.println(shape1.toString());
    }
}