package Tiles;

import Graphics.Assets;

public class McDonaldTile extends Tile {

    public McDonaldTile(int id)
    {
        super(Assets.McDonald, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
