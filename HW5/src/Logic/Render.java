package Logic;

import Domaine.Model3D;
import View.Screen;

/**
 * Класс рендеринга
 */
public class Render {
    /**
     * Функция рендеринга
     * @param model3D
     * @return Результат выполнения операции
     */
    Screen rendering (Model3D model3D){
        System.out.println("Выполнен рендеринг модели");
        Screen screen = new Screen();
        screen.condition = "Рендеринг модели " + model3D;
        return screen;
    }
}
