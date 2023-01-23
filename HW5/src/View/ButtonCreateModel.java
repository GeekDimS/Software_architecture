package View;

/**
 * Класс кнопки создания новой модели
 */
public class ButtonCreateModel {
    /**
     *
     * Функция обработки нажатия кнопки
     *
     * @param mainWindow
     */
    public void onClick(MainWindow mainWindow) {
        mainWindow.editModel.createModel();
        mainWindow.frameEditModel.draw(mainWindow.editModel.render());
    }
}
