package Tiles;

import Graphics.Assets;

public class PavajTile extends Tile {

    public PavajTile(int id)
    {
        super(Assets.pavaj, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}