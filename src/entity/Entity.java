package entity;

import java.awt.*;
import java.awt.image.BufferedImage;

//Clasa va conține variabilele ce vor fi folosite pentru player-i
public class Entity {


    public int speed, x, y;

    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;

    public Rectangle solidArea;
    public boolean collisionOn = false;
}
