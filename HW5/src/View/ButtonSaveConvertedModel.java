package View;

/**
 * Класс кнопки сохранения конвертированной модели
 */
public class ButtonSaveConvertedModel {
    /**
     *
     * Функция обработки нажатия кнопки
     *
     * @param fileName
     * @param mainWindow
     */
    public void onClick(String fileName, MainWindow mainWindow) {
        mainWindow.storage.saveToFile(fileName, mainWindow.editModel.getModel(), true);
    }
}
