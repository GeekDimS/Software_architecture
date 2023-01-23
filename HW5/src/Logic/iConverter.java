package Logic;

import Domaine.ConvertedModel;
import Domaine.Model3D;

/**
 * Интерфейс для конвертации текущей модели
 */
public interface iConverter {
    /**
     *
     * Возвратить ссылку на сконвертированную модель
     *
     * @param model3D
     * @return Результат выполнения операции
     */
    ConvertedModel getConvertedModelForSave(Model3D model3D);
}
