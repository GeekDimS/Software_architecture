package Domaine;

/**
 * Интерфейс для сохранения модели
 */
public interface iStorage {
    /**
     * Загрузка модели из файла
     *
     * @param fileName
     * @return Model3D
     */
    Model3D loadFromFile(String fileName);

    /**
     * Сохранение модели в файл
     *
     * @param fileName
     * @param model3D
     * @param needConvert
     */
    void saveToFile(String fileName, Model3D model3D, boolean needConvert);

}
