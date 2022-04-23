package Graphics;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    private final BufferedImage spriteSheet;
    private static final int tileWidth = 48;
    private static final int tileHeight = 48;

    public SpriteSheet(BufferedImage buffImg) {
        spriteSheet = buffImg;
    }

    public BufferedImage crop(int x, int y) {
        return spriteSheet.getSubimage(x * tileWidth, y * tileHeight, tileWidth, tileHeight);
    }

    public BufferedImage crop2(int x, int y) {
        return spriteSheet.getSubimage(x * tileWidth, y * tileHeight, 353, 179);
    }

    public BufferedImage cropDorm(int x, int y) {
        return spriteSheet.getSubimage(x * tileWidth, y * tileHeight, 1901, 2509);
    }

    public BufferedImage cropStreet(int x, int y, int z) {
        if (z == 1)
            return spriteSheet.getSubimage(x, y, 241, 162);
        else if (z == 2)
            return spriteSheet.getSubimage(x, y, 250, 171);
        else if (z == 3)
            return spriteSheet.getSubimage(x, y, 169, 254);
        else if (z == 4)
            return spriteSheet.getSubimage(x, y, 171, 76);
        else
            return spriteSheet.getSubimage(x, y, 173, 137);
    }

    public BufferedImage cropHotel(int x, int y) {
        return spriteSheet.getSubimage(x, y, 709, 975);
    }

    public BufferedImage cropOpelCar(int x, int y) {
        return spriteSheet.getSubimage(x, y, 1544, 868);
    }

    public BufferedImage cropPavaj(int x, int y) {
        return spriteSheet.getSubimage(x, y, 800, 533);
    }

    public BufferedImage cropBMWCar(int x, int y) {
        return spriteSheet.getSubimage(x, y, 500, 250);
    }

    public BufferedImage cropDuster(int x, int y) {
        return spriteSheet.getSubimage(x, y, 882, 502);
    }

    public BufferedImage cropTree(int x, int y) {
        return spriteSheet.getSubimage(x, y, 5127, 5868);
    }

    public BufferedImage cropMc(int x, int y) {
        return spriteSheet.getSubimage(x, y, 384, 382);
    }

    public BufferedImage cropKFC(int x, int y) {
        return spriteSheet.getSubimage(x, y, 572, 256);
    }
}