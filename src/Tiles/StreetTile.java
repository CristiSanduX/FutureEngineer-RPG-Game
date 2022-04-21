package Tiles;

import Graphics.Assets;

public class StreetTile extends Tile
{
    public StreetTile(int id)
    {
        super(Assets.streetNormal, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}