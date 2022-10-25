package openclose;

public class Sphere2 extends GeoObjects{
    public double radius;


    public double getVolume()
    {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}
