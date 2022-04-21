package Tiles;

import Graphics.Assets;

public class CarTile extends Tile {

    public CarTile(int id)
    {
        super(Assets.OpelCar, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}