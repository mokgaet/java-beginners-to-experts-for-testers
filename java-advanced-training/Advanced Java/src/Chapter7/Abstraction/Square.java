package Chapter7.Abstraction;

public class Square extends Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public int getArea() {
        return (int) (this.side * this.side);
    }

    @Override
    public int getParimeter() {
        return (int) (4*this.side);
    }

}
