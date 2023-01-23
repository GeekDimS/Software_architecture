import View.MainWindow;

/**
 * @author DimS on ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        MainWindow.getMainWindow().buttonCreateModel.onClick(mainWindow);
        mainWindow.buttonLoadModel.onClick("File.mod", mainWindow);
        mainWindow.buttonEditModel.onClick(mainWindow);
        mainWindow.buttonSaveModel.onClick("File2.mod", mainWindow);
        mainWindow.buttonSaveConvertedModel.onClick("ConvertFile", mainWindow);
    }
}