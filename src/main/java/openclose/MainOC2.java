package openclose;

public class MainOC2 {
    public static void main(String args[])
    {
        // Initializing cuboid1 as well as declaring
        // its dimensions.
        Cuboid2 cb1 = new Cuboid2();

        // Custom entries
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;

        // Initializing Cuboid2 as well as declaring
        // its dimensions.
        Cuboid2 cb2 = new Cuboid2();
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;

        // initializing Cuboid3 as well as declaring
        // its dimensions.
        Cuboid2 cb3 = new Cuboid2();
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;

        // initializing Sphere1 as well as declaring
        // its dimension.
        Sphere2 sp1 = new Sphere2();
        sp1.radius = 5;

        // initializing Sphere2 as well as declaring
        // its dimension.
        Sphere2 sp2 = new Sphere2();
        sp2.radius = 2;

        // initializing Sphere3 as well as declaring
        // its dimension.
        Sphere2 sp3 = new Sphere2();
        sp3.radius = 3;

        // Now, initializing and declaring
        // an array of Geo_objects
        GeoObjects[] g_arr = new GeoObjects[6];

        // Setting Geo_objects to cuboid class
        g_arr[0] = cb1;
        g_arr[1] = cb2;
        g_arr[2] = cb3;

        // Setting Geo_objects to sphere class
        g_arr[3] = sp1;
        g_arr[4] = sp2;
        g_arr[5] = sp3;

        // Initializing the Application class
        Volume2 app = new Volume2();

        // Getting the total volume
        // using get_total_volume
        double vol = app.getTotalVolume(g_arr);

        // Printing total volume
        System.out.println("The total volume is " + vol);
    }
}
