package Tiles;

import Graphics.Assets;

public class TreeTile extends Tile
{
    public TreeTile(int id)
    {
        super(Assets.tree, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}