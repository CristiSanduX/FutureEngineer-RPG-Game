package Graphics;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage tree;
    public static BufferedImage AC;
    public static BufferedImage grass2;
    public static BufferedImage dorm;
    public static BufferedImage streetNormal;
    public static BufferedImage streetMiddle;
    public static BufferedImage street3;
    public static BufferedImage streetMiddle2;
    public static BufferedImage streetRight;
    public static BufferedImage hotel;
    public static BufferedImage OpelCar;
    public static BufferedImage BMWCar;
    public static BufferedImage Duster;
    public static BufferedImage pavaj;
    public static BufferedImage McDonald;
    public static BufferedImage KFC;
    public static BufferedImage background;

    public static void Init() {
        SpriteSheet sheetGrass = new SpriteSheet(ImageLoader.LoadImage("/textures/grass2.jpg"));
        SpriteSheet sheetTree = new SpriteSheet(ImageLoader.LoadImage("/textures/Tree1.png"));
        SpriteSheet sheetStreet = new SpriteSheet(ImageLoader.LoadImage("/textures/Street.png"));
        SpriteSheet sheetStreet2 = new SpriteSheet(ImageLoader.LoadImage("/textures/Street2.png"));
        SpriteSheet sheetPavaj = new SpriteSheet(ImageLoader.LoadImage("/textures/pavaj.jpg"));
        SpriteSheet sheetAC = new SpriteSheet(ImageLoader.LoadImage("/textures/AC.png"));
        SpriteSheet sheetDorm = new SpriteSheet(ImageLoader.LoadImage("/textures/Dorm.png"));
        SpriteSheet sheetHotel = new SpriteSheet(ImageLoader.LoadImage("/textures/Hotel.png"));
        SpriteSheet sheetOpelCar = new SpriteSheet(ImageLoader.LoadImage("/textures/OpelAstra.png"));
        SpriteSheet sheetBMWCar = new SpriteSheet(ImageLoader.LoadImage("/textures/BMW.png"));
        SpriteSheet sheetDuster = new SpriteSheet(ImageLoader.LoadImage("/textures/Duster.png"));
        SpriteSheet sheetMc = new SpriteSheet(ImageLoader.LoadImage("/textures/McDonald's.png"));
        SpriteSheet sheetKFC = new SpriteSheet(ImageLoader.LoadImage("/textures/KFC.png"));
        SpriteSheet sheetBackground = new SpriteSheet(ImageLoader.LoadImage("/textures/Background.jpg"));


        AC = sheetAC.crop2(0, 0);
        grass2 = sheetGrass.crop(0, 0);
        dorm = sheetDorm.cropDorm(0, 0);
        streetNormal = sheetStreet.cropStreet(317, 47, 1);
        streetMiddle = sheetStreet.cropStreet(312, 340, 2);
        street3 = sheetStreet.cropStreet(76, 151, 3);
        streetMiddle2 = sheetStreet.cropStreet(353, 260, 4);
        streetRight = sheetStreet2.cropStreet(0, 0, 5);
        hotel = sheetHotel.cropHotel(0, 0);
        OpelCar = sheetOpelCar.cropOpelCar(0, 0);
        BMWCar = sheetBMWCar.cropBMWCar(0, 0);
        Duster = sheetDuster.cropDuster(0, 0);
        pavaj = sheetPavaj.cropPavaj(0, 0);
        McDonald = sheetMc.cropMc(0, 0);
        KFC = sheetKFC.cropKFC(0, 0);
        tree = sheetTree.cropTree(0, 0);
        background = sheetBackground.cropBackground(0,0);
    }
}