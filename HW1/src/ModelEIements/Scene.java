package ModelEIements;

import java.util.ArrayList;

/**
 * @author DimS on 19.12.2022
 */
public class Scene<Type> {
    public int id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();

    public Scene(PoligonalModel inModel, Camera inCamera) {
        this.models.add(inModel);
        this.cameras.add(inCamera);
    }

    public Type method1(Type var) {
        return null;
    }

    public Type method2(Type var1, Type var2) {
        return null;
    }
}
