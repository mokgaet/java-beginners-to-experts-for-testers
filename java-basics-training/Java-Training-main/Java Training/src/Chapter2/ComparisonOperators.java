package Chapter2;

public class ComparisonOperators {

    public static void main(String[] args) {
        boolean b;

        b = (2 == 2.0); // equal to (false)
        System.out.println(b);
        b = (3!= 3); // not equal to (true)
        System.out.println(b);

        b = (2 > 3); // greater than (false)
        System.out.println(b);

        b = (12 < 13); // less than (true)
        System.out.println(b);

        b = (8.0 >= 8); // greater than or equal to (false)
        System.out.println(b);

        b = (2.99 <= 2.89); // less than or equal to (true)
        System.out.println(b);
    }
}
