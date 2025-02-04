package Chapter7;

public class VehicleRunner {
    public static void main(String[] args) {

        // Create an object
        //Vehicle obj_vehicle = new Vehicle(); // default constructor used to create instance of the object

        Vehicle obj_vehicle = new Vehicle("BMW","mmk 001 LP",1400.50,"Mellow-Yellow",2019,"Automatic");

        obj_vehicle.display();

       /*
            LO 1:Creating Clasess
        obj_vehicle.transmission_type = "Manual";
        obj_vehicle.registration_number = "MMK 2001 LP";
        obj_vehicle.miles_covered = 14000.50;
        obj_vehicle.year = 2019;
        obj_vehicle.color = "Black";
        obj_vehicle.model = "BMW";
        obj_vehicle.display();

        */

    }
}
