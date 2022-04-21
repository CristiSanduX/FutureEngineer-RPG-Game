package Tiles;

import Graphics.Assets;

public class StreetTile2 extends Tile
{
    public StreetTile2(int id)
    {
        super(Assets.streetMiddle, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}