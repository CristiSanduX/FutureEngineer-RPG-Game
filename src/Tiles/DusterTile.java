package Tiles;

import Graphics.Assets;

public class DusterTile extends Tile {

    public DusterTile(int id)
    {
        super(Assets.Duster, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}