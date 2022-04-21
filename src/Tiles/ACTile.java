package Tiles;

import Graphics.Assets;

public class ACTile extends Tile {

    public ACTile(int id)
    {
        super(Assets.AC, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}