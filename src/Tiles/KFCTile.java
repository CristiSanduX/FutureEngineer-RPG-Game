package Tiles;

import Graphics.Assets;

public class KFCTile extends Tile {

    public KFCTile(int id)
    {
        super(Assets.KFC, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}