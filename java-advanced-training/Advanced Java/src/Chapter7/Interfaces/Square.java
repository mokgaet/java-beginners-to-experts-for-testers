package Chapter7.Interfaces;


public class Square implements iShape, iShapeGraphics {

    private double side;

    /**
     * Method to draw the square
     */
    @Override
    public void draw() {
        System.out.println("drawing a square of "+ this.side +" x "+ this.side);
    }

    /**
     * Method to apply color
     * @param color colour to be applied
     */
    @Override
    public void applyColor(String color) {
        System.out.println("Colour "+ color+ " is applied to the Square of " +this.side+" x "+this.side);
    }

    @Override
    public int getArea() {
        return (int) (this.side * this.side);
    }

    @Override
    public double getPerimeter() {
        return 4* this.side;
    }


}