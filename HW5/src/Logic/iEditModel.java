package Logic;

import Domaine.Model3D;
import View.Screen;

/**
 * Интерфейс для создания, редактирования и возврата изменённой модели
 */
public interface iEditModel {
    /**
     * Создание новой модели
     */
    void createModel();

    /**
     *
     * Функция заглушка редактирования модели с помощью неких текстовых команд
     *
     * @param command
     * @return Возвращает сразу результат рендеринга изменённой модели
     */
    Screen editCommand(String command);
    /**
     *
     * Функция рендеринга модели
     *
     * @return Результат выполнения операции
     */
    Screen render();
    /**
     *
     * Функция создания модели из загруженной из файла
     *
     * @param loadModel
     */
    void createModel(Model3D loadModel);

    /**
     * Функция возврата ссылки на текущую 3Д модель
     *
     * @return Результат выполнения операции
     */
    Model3D getModel();
}
