package Chapter2;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean b =true , a = true , c = false, results ;
        int x= 5 , y=6 ,z =3;

        System.out.println(a||b);

        System.out.println(b);
        results = (c || (x > z));
        System.out.println( results );

        System.out.println(!b);

        /*  Beaware : You cannot have
        ---> T || T
        ---> F && F
         */
    }
}
