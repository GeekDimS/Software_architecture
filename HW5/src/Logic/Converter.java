package Logic;

import Domaine.ConvertedModel;
import Domaine.Model3D;

/**
 * Класс конвертации модели
 */
public class Converter implements iConverter{
    /**
     *
     * Функция возврата сконвертированной модели
     *
     * @param model3D
     * @return Результат выполнения операции
     */
    @Override
    public ConvertedModel getConvertedModelForSave(Model3D model3D) {
        return  this.convert(model3D);
    }

    /**
     *
     * Функция конвертации 3Д модели в другой формат
     *
     * @param model3D
     * @return Сконвертированная модель
     */
    private ConvertedModel convert(Model3D model3D) {
        ConvertedModel convertedModel = new ConvertedModel();
        convertedModel.nameOrigModel = model3D.toString();
        System.out.println("Конвертирована модель " + model3D);
        return convertedModel;
    }

}
