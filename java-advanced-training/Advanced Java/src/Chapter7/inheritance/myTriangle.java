package Chapter7.inheritance;

public class myTriangle extends Shape{

    private double c ;
    public myTriangle(){
        super();
        this.c = 5;
    }
    public myTriangle(double base , double height,double c){
        super(base,height);
        this.c = c;

    }

    /**
     * Class method to calculate the area of a triangle
     * @return 1/2x base x height
     */
    @Override
    public double calArea() {
        return (int) (1/2)*(this.length * this.width);
    }

    /**
     * Class method to calculate Perimeter of a triangle
     * @return  sum of the lengths of its three sides (a + b + c)
     */
    @Override
    public double getPerimeter() {
        return (this.length + this.c + this.width);
    }

    @Override
    public String displayShapeDetails() {
        return "**********************************************" +
                "\nBase: " + this.length +
                "\nHeight: "+ this.width +
                "\nSide 3: "+ this.c +
                "\nArea: "+ this.calArea() +
                "\nPerimeter: "+ this.getPerimeter() ;
    }
}
