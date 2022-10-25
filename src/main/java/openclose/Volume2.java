package openclose;

public class Volume2 {
    public double
    getTotalVolume(GeoObjects[] geo_objects)
    {

        double vol_sum = 0;


        for (GeoObjects geo_obj : geo_objects) {
            vol_sum += geo_obj.getVolume();
        }

        return vol_sum;
    }
}
