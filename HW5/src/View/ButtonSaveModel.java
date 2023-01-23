package View;

/**
 * Класс кнопки сохранения модели
 */
public class ButtonSaveModel {
    /**
     *
     * Функция обработки нажатия кнопки
     *
     * @param fileName
     * @param mainWindow
     */
    public void onClick(String fileName, MainWindow mainWindow) {
        mainWindow.storage.saveToFile(fileName, mainWindow.editModel.getModel(), false);
    }
}
