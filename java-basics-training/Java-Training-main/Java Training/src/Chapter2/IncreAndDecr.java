package Chapter2;

public class IncreAndDecr {
    public static void main(String[] args) {

        int age = 20, counter = 10;

        // Pre Increment and Pre decrement
        // - the compile will change the value before it is used
        System.out.println("=======/Pre Increment and Pre decrement/============");
        System.out.println("Original values : Age = " + age +", Counter = "+counter);
        System.out.println("Pre-Increment Age: " + ++age );
        System.out.println("Pre-decrement Counter: " + --counter);
        System.out.println("==============================================");

        // Post- Increment and Post- decrement

        // the values will be changed after being used or compiled
        System.out.println("===========/Post- Increment and Post- decrement/=========");
        System.out.println("Current values : Age = " + age +", Counter = "+counter);
        System.out.println("Pre-Increment Age: " + age++);
        System.out.println("Pre-decrement Counter: " + counter--);

        System.out.println("Final Values: Age" + age +", Counter: "+counter);



    }
}
