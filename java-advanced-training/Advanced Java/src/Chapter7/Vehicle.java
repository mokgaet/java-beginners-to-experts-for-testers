package Chapter7;
/**
* Vehicle class to accomplish the following Learning Objectives
*  1. Creating classes
*  2. Instance / Class Variables
*  3. Access levels
*  4. Constructors
*/
public class Vehicle {


    // Class Variable

    private String registration_number;
    private int year;
    private double miles_covered; // mileage
    private String transmission_type;
    private String model ;
    private String color ;


    // Constructors

    // default constructor
    public Vehicle(){
        this.registration_number = "None";
        this.transmission_type = "Manual";
        this.color = "Grey";
        this.year = 2025;
        this.miles_covered = 0;
        this.model = "None";


    }

    /* Overloaded constructor
            - Can have as many as you want
     */

    public Vehicle(String model,String registration_number , double miles){
        this.model = model;
        this.registration_number = registration_number;
        miles_covered = miles;

    }
    /**
    * @param model Model of the cehicle
    * @param RegistrationNumber  Registration number of the vehicle
    * @param miles  millage coverage by the car so far
    * @param color color of the car
    * @param year year the car was bought
    * @param transmission_type Manual or Automatic vehicle
     */
    public Vehicle(String model,String registration_number , double miles,String color , int year , String transmission_type){
        this.model = model;
        this.registration_number = registration_number;
        miles_covered = miles;
        this.color = color;
        this.transmission_type = transmission_type;
        this.year = year;

    }


    // Methods or functions

    public void display(){
        System.out.println("Reg#: "+ registration_number);
        System.out.println("Model: "+ model);
        System.out.println("Transmission type: "+ transmission_type);
        System.out.println("Year: "+ year );

        System.out.println("Miles Covered: "+ miles_covered);
        System.out.println("Color: "+ color);


    }

}
