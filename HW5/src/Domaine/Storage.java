package Domaine;

import Logic.Converter;
import Logic.iConverter;

/**
 * Класс для действий сохранения модели
 */
public class Storage implements iStorage  {
    final iConverter converter = new Converter();
    ConvertedModel convertedModel;
    @Override
    public Model3D loadFromFile(String fileName) {
        System.out.println("Модель загружена из файла " + fileName);
        return new Model3D();
    }

    /**
     * @param fileName
     * @param model3D
     * @param needConvert
     */
    @Override
    public void saveToFile(String fileName, Model3D model3D, boolean needConvert) {
        if(!needConvert) {
            System.out.println("Модель " + model3D + " сохранена в файл " + fileName);
            return;
        }
        convertedModel = converter.getConvertedModelForSave(model3D);
        System.out.println("Модель " + convertedModel + " сохранена в файл " + fileName);
    }
}
