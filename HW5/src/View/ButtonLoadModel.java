package View;


/**
 * Класс кнопки загрузки модели
 */
public class ButtonLoadModel {
    /**
     *
     * Функция обработки нажатия кнопки
     *
     * @param fileName
     * @param mainWindow
     */
    public void onClick(String fileName, MainWindow mainWindow){
        mainWindow.editModel.createModel(mainWindow.storage.loadFromFile(fileName));
        mainWindow.frameViewModel.draw(mainWindow.editModel.render());
    }
}
