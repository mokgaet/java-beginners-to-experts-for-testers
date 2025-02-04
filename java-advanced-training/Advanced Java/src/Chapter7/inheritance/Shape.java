package Chapter7.inheritance;

public class Shape {

    protected double length , width;

    /**
     * Default constructor
     */
    public Shape(){
        length = 5;
        width = 2;
    }

    /**
     * Overloaded Constructor
     * @param length the length of the shape
     * @param width the withd of the shape
     */

    public Shape(double length , double width){
        this.length = length;
        this.width = width;
    }

    /**
     * Get length
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * Set the length of the shape
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get the width of a shape
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Change the width of the shape
     * @param width new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Calculate the Area of a shape
     * @return the area of the shape
     */
    public double calArea(){
        return (int) (this.length*this.width);
    }

    /**
     * Calculate the Perimeter of the shape
     * @return
     */
    public double getPerimeter(){
            return (int) (2 * length) + (2 * width);
    }

    public String displayShapeDetails(){
        return "**********************************************" +
                "\nLength: " + this.length +
                "\nWidth: "+ this.width+
                "\nArea: "+ this.calArea() +
                "\nPerimeter: "+ this.getPerimeter() ;
    }
}
