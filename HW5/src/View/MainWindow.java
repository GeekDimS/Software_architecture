package View;

import Domaine.Storage;
import Domaine.iStorage;
import Logic.EditModel;
import Logic.iEditModel;

/**
 * Класс главного окна приложения
 */
public class MainWindow {
    private static MainWindow mainWindow;
    public final FrameEditModel frameEditModel = new FrameEditModel();
    public final FrameViewModel frameViewModel = new FrameViewModel();
    public final ButtonCreateModel buttonCreateModel = new ButtonCreateModel();
    public final ButtonLoadModel buttonLoadModel = new ButtonLoadModel();
    public final ButtonSaveModel buttonSaveModel = new ButtonSaveModel();
    public final ButtonSaveConvertedModel buttonSaveConvertedModel = new ButtonSaveConvertedModel();
    public final ButtonEditModel buttonEditModel = new ButtonEditModel();
    public final iStorage storage = new Storage();
    final iEditModel editModel = new EditModel();
    Screen screen = new Screen();

    public static MainWindow getMainWindow() {
        if(mainWindow == null){
            mainWindow = new MainWindow();
        }
        return mainWindow;
    }
}
