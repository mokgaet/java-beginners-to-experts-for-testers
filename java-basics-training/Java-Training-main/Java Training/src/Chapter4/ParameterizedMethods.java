package Chapter4;

public class ParameterizedMethods {

    static int calSum (int num1, int num2){

        return  num1+num2;
    }

    // -- > Method Overloading

    static  int calSum(int n1, int n2 , int n3){
        return n1+n2+n3;
    }



    public static void main(String[] args) {
        int sum = calSum(25,52);
    }
}
