package openclose;

public class Cuboid2 extends GeoObjects{
    public double length;
    public double breadth;
    public double height;

    // overrided function to calculate
    // the volume of a cuboid
    // @Override
    public double getVolume()
    {
        return length * breadth * height;
    }
}
