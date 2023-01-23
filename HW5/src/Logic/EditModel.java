package Logic;

import Domaine.Model3D;
import View.Screen;

/**
 * Класс для создания, редактирования и возврата изменённой модели
 */
public class EditModel implements iEditModel {
    final Render render = new Render();
    private Model3D model3D = new Model3D();

    /**
     *
     */
    @Override
    public void createModel() {
        model3D = new Model3D();
        System.out.println("Создана новая модель " + model3D);
    }

    @Override
    public Screen editCommand(String command) {

        System.out.println("Выполнилась команда редактирования");
        return this.render();
    }

    @Override
    public Screen render() {
        return render.rendering(model3D);
    }

    @Override
    public void createModel(Model3D loadModel) {
        this.model3D = loadModel;
    }

    @Override
    public Model3D getModel() {
        return this.model3D;
    }
}
