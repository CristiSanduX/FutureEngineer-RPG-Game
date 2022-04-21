package Tiles;

import Graphics.Assets;

public class CarBMWTile extends Tile {

    public CarBMWTile(int id)
    {
        super(Assets.BMWCar, id);
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}