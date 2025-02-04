package Chapter4;

public class MethodOverloading {

    //--> ... essential means any number of arguments
    static int calSum(int... numbers){
        int tot = 0;

        for(int num: numbers){
            tot+=num;
        }
        return tot;
    }
    static double calSum(double... numbers){
        double tot = 0 ;
        for (double num: numbers){
            tot+=num;
        }

        return tot;
    }

    public static void main(String[] args) {
        System.out.println("Total sum : " + calSum(12,25,58,5));
        System.out.println("Total sum : " + calSum(12.12,25.25,58.58,5.5));
        System.out.println("Total sum : " + calSum(12));

        System.out.println("Total sum : " + calSum(20,20));
        System.out.println("Total sum : " + calSum(20.20,20.20));
    }


}
