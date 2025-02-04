package Chapter6;

public class DebugExercise5 {
   public static void main(String[] args) {
	System.out.println("Average Calculator");

	double avg = calcAverage(1,2,3);
  	System.out.println("The average is: " + avg);     
  } 

public static double calcAverage(double... numbers) {
	double results = 0 ;
	int count = 0 ;   // add this counter to get the number of values

	for (double n : numbers){
		results += n;
		count++;  // update the counter
	}
	results = (results/count); // Average Calculation

	return results; //: the method was returning the sum instead of the Average
   } 

}