package main;

import Graphics.Assets;
import object.OBJ_Time;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }
    public void setObject() {
        gp.obj[0] = new OBJ_Time();
        gp.obj[0].worldX = 5 * gp.tileSize;
        gp.obj[0].worldY = 13 * gp.tileSize;

        gp.obj[1] = new OBJ_Time();
        gp.obj[1].worldX = 8 * gp.tileSize;
        gp.obj[1].worldY = 8 * gp.tileSize;

        gp.obj[2] = new OBJ_Time();
        gp.obj[2].worldX = 21 * gp.tileSize;
        gp.obj[2].worldY = 10 * gp.tileSize;
    }
}
