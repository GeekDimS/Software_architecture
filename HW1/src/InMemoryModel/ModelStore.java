package InMemoryModel;

import ModelEIements.Camera;
import ModelEIements.Flash;
import ModelEIements.PoligonalModel;
import ModelEIements.Scene;
import ModelEIements.Texture;

import java.util.ArrayList;

/**
 * @author DimS on 21.12.2022
 */
public class ModelStore implements IModelChanger {
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Scene> scenes = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changedObservers = new ArrayList<>();

    public ModelStore(Texture texture) {
        this.models.add(new PoligonalModel(texture));
        this.cameras.add(new Camera());
        this.scenes.add(new Scene(models.get(0), cameras.get(0)));
        this.flashes.add(new Flash());
    }

    public Scene GetScene(int sceneNumber) {
        return scenes.get(sceneNumber);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
    }
}
