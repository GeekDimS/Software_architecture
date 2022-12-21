package ModelEIements;

import AccessoryModule.Point3D;

/**
 * @author DimS on 19.12.2022
 */
public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

    public PoligonalModel(Texture inpTexture) {
        this.textures = inpTexture;
        this.poligons = new Poligon(new Point3D());
    }
}
