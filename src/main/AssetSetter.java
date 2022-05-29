package main;

import Graphics.Assets;
import entity.NPC_Ionut;
import object.OBJ_Finish;
import object.OBJ_Time;

import java.security.PublicKey;

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

        gp.obj[3] = new OBJ_Finish();
        gp.obj[3].worldX = 1 * gp.tileSize;
        gp.obj[3].worldY = 4 * gp.tileSize;

        gp.obj[4] = new OBJ_Finish();
        gp.obj[4].worldX = 7 * gp.tileSize;
        gp.obj[4].worldY = 1 * gp.tileSize;

    }
    public void setNPC() {
        gp.npc[0] = new NPC_Ionut(gp);
        gp.npc[0].x = gp.tileSize*20;
        gp.npc[0].y = gp.tileSize*5;
    }
}
