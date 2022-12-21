package ModelEIements;

import AccessoryModule.Point3D;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DimS on 19.12.2022
 */
public class Poligon {
    public ArrayList<Point3D> points = new ArrayList<>();

    public Poligon(Point3D inPoint) {
        points.add(inPoint);
    }
}
