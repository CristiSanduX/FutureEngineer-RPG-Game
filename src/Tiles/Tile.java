package Tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile
{
    private static final int NO_TILES   = 32;
    public static Tile[] tiles          = new Tile[NO_TILES];
    public static Tile grassTile        = new GrassTile(0);
    public static Tile treeTile         = new TreeTile(3);
    public static Tile ACTile           = new ACTile(5);
    public static Tile dormTile        = new DormTile(6);
    public static Tile streetTile       = new StreetTile(7);
    public static Tile streetTile2       = new StreetTile2(8);
    public static Tile streetTile3       = new StreetTile3(9);
    public static Tile streetTile5       = new StreetTile5(11);
    public static Tile hotelTile         = new HotelTile(12);
    public static Tile carTile           = new CarTile(13);
    public static Tile pavajTile           = new PavajTile(14);
    public static Tile BMWCarTile          = new CarBMWTile(14);
    public static Tile dusterTile          = new DusterTile(15);
    public static Tile mcdonaldTile         = new McDonaldTile(15);
    public static Tile kfcTile         = new KFCTile(15);

    public static final int TILE_WIDTH  = 32;
    public static final int TILE_HEIGHT = 32;
    protected BufferedImage img;
    protected final int id;

    public Tile(BufferedImage image, int idd)
    {
        img = image;
        id = idd;

        tiles[id] = this;
    }

    public void Draw(Graphics g, int x, int y)
    {
            /// Desenare dala
        g.drawImage(img, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }
    public void Draw2(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 235, 119, null);
    }
    public void DrawDorm(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 1901/10, 2509/10, null);
    }
    public void DrawStreet(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 32, 32, null);
    }
    public void DrawStreet2(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 32, 32, null);
    }
    public void DrawHotel(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 709/6, 975/6, null);
    }
    public void DrawOpelCar(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 1544/25, 868/25, null);
    }
    public void DrawBMWCar(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 500/8, 250/8, null);
    }
    public void DrawTree(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 64, 64, null);
    }
    public void DrawMcDonalds(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 128, 128, null);
    }
    public void DrawKFC(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 572/3, 256/3, null);
    }
    public void DrawDuster(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 882/14, 502/14, null);
    }
    public boolean IsSolid()
    {
        return false;
    }

}
