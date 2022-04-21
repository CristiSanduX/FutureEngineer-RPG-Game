package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {
    GamePanel gp;
    public Tile[] tile;
    public int[][] mapTileNum;
    public BufferedImage img;

    public TileManager(GamePanel gp)
    {
        this.gp = gp;
        tile = new Tile[10];
        mapTileNum = new int[gp.maxScreenCol][gp.maxScreenRow];
        getTileImage();
        loadMap();
    }
    public void getTileImage()
    {
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));
            tile[1].collision = true;

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/water.png"));
            tile[2].collision = true;

            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/earth.png"));

            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/textures/pavaj.jpg"));
            tile[4].collision = true;

            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/sand.png"));



        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void loadMap()
    {
        try
        {
            InputStream is = getClass().getResourceAsStream("/map/Map.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col=0, row=0;
            while (col < gp.maxScreenCol && row < gp.maxScreenRow)
            {
                String line = br.readLine();
                while (col < gp.maxScreenCol)
                {
                    String numbers[] = line.split(" ");
                    int num = Integer.parseInt(numbers[col]);
                    mapTileNum[col][row] = num;
                    col++;
                }
                if (col == gp.maxScreenCol) {
                    col = 0;
                    row++;
                }

            }
            br.close();
        }catch(Exception e)
        {

        }
    }
    public void draw(Graphics2D g2)
    {
        int col=0, row=0, x=0, y=0;

        while (col < gp.maxScreenCol && row <gp.maxScreenRow)
        {
            int tileNum = mapTileNum[col][row];

            g2.drawImage(tile[tileNum].image,x,y,gp.tileSize,gp.tileSize,null);
            col++;
            x += gp.tileSize;

            if (col == gp.maxScreenCol)
            {
                col=0; x=0;
                row++;
                y += gp.tileSize;
            }
        }
    }
    public void Draw2(Graphics g, int x, int y)
    {
        /// Desenare dala
        g.drawImage(img, x, y, 32, 32, null);
    }
}
