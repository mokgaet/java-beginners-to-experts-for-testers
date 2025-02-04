package Chapter3;

public class ForLoop {

    public static void main(String[] args) {

        //  ---> Known as counter-controlled loop
        //  ---> Used when you know how many times must the loop execute

        System.out.println("************* Single Loop | Post-decrement usage| ********************");

        for (int i = 5 ; i > 2 ; i--) {
            System.out.println(i + "- iLAB Training");

        } // used post decrement

        System.out.println("************* Single Loop | Post-increment usage| ********************");

        for (int i = 5 ; i < 8 ; i++) {
            System.out.println(i + "- iLAB Training");

        } // used post increment

        System.out.println("\n**********Multiple Loop Conditions with OR operator *****************");
        // will only terminate when both conditions are FALSE
        for (int a = 1, b=5 ; a <= 5  || b <= 8 ; a++, b++) {
            System.out.println("a - " + a +"\tb - "+b);

        }

        System.out.println("\n**********Multiple Loop Conditions with AND operator *****************");
        // Will terminate only if one condition is FALSE
        for (int a = 1, b=5 ; a <= 5  && b <= 8 ; a++, b++) {
            System.out.println("a - " + a +"\tb - "+b);

        }

        System.out.println("\n**********Display number from 10 to 1 *****************");
        for (int a = 10 ; a >=1 ;a-- ) {
            System.out.print(a +" ");
        }

        // --> Increment by 5
        System.out.println("\n \n**********Display number from 50 to 0 , multiple of 5 *****************");
        for (int a = 50 ; a >=0 ;a-=5) {
            System.out.print(a +" ");
        }

    } // end main


}
