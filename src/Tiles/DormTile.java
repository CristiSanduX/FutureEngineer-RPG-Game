package Tiles;

import Graphics.Assets;

public class DormTile extends Tile
{
    public DormTile(int id)
    {
        super(Assets.dorm, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}