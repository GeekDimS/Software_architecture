package View;

/**
 * Класс кнопки редактирования модели
 */
public class ButtonEditModel {
    /**
     *
     *
     * Функция обработки нажатия кнопки
     * @param mainWindow
     */
    public void onClick(MainWindow mainWindow){
        mainWindow.frameEditModel.draw(mainWindow.editModel.render());
    }
}
