package Tiles;

import Graphics.Assets;

public class StreetTile5 extends Tile
{
    public StreetTile5(int id)
    {
        super(Assets.streetRight, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}