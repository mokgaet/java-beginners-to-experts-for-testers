package Chapter7.inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
        myRectangle rectangle = new myRectangle(5,4);
        myCircle circle = new myCircle(12);
        myTriangle triangle = new myTriangle(5,13,15);

        System.out.println("\t\t\t\tTriangle\t\n"+triangle.displayShapeDetails());
        System.out.println("\t\t\t\t Circle\t\n"+circle.displayShapeDetails());
        System.out.println("\t\t\t\t Rectangle\t\n"+rectangle.displayShapeDetails());
    }

}
