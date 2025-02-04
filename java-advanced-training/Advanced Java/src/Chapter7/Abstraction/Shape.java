package Chapter7.Abstraction;

/**
 * Objective for this class is to put into practice the Abstraction principle into practices
 */
public abstract class Shape {

    public abstract int getArea();
    public abstract int getParimeter();
    public String PrintDetails(){
        return  "----------- " + this.getClass().getName() + "--------------\nArea: " + this.getArea() +"\nPerimeter: "+getParimeter();
    }



}
