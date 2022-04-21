package Tiles;

import Graphics.Assets;

public class HotelTile extends Tile{

    public HotelTile(int id)
    {
        super(Assets.hotel, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}