package Chapter7.inheritance;

public class myCircle extends Shape {

   // private double radius;

    /**
     * Default Constructor with default values
     */
    public myCircle(){
        this.length = 5;
    }

    /**
     * Overloaded Constructor
     * @param r radius of a circle
     */
    public myCircle (double r ){
        //this.radius = r;
        super(r,0);
    }

    /**
     * Over-writing a method  to calculate the Area of a circle
     * @return area of a circle
     */
    public double calArea() {
        return (int) Math.PI * (this.length * this.length);
    }

    /**
     * Over-writing a method  to calculate the Perimeter of a circle
     * @return perimeter of a circle
     */
    public double getPerimeter() {
        return (int) (2 * (Math.PI * this.length));
    }



}
