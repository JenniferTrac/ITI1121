import java.util.Scanner;

public class Q6{
	public static void main(String[] args){

		double[] grades = new double[10];

		Scanner scanName = new Scanner(System.in);

		for (int i=0; i<10; i++) {
			System.out.println("Enter the student's grade (#" + (i+1) + "): ");
			grades[i] = scanName.nextDouble();
		}

		// sort the grades
		Q6.sortDoubles(grades);

		// Average
		double studentAverage = Q6.calculateAverage(grades);
		System.out.println("The student's grade average was: " + studentAverage);

		// Median
		double studentMedian = Q6.calculateMedian(grades);
		System.out.println("The student's grade median was: " + studentMedian);

		// failed classes
		int failedClasses = Q6.calculateNumberFailed(grades);
		System.out.println("The student failed " + failedClasses + " classes");

		// passed classes
		int passedClasses = Q6.calculateNumberPassed(grades);
		System.out.println("The student passed " + passedClasses + " classes");


	}

	public static void sortDoubles(double[] values) {

		int valuesMin;
		double smallestDouble;

		for (int i=0; i<values.length-1; i++) {
			//this loop is to move the max to the front of the array
			valuesMin = i;
			for (int j=i+1; j<values.length; j++) {
				// this loop is to find the max of the values
				if (values[j] < values[valuesMin]) {
					valuesMin = j;
				}
			}
			smallestDouble = values[valuesMin];
			values[valuesMin] = values[i];
			values[i] = smallestDouble;
		}
	}

	public static double calculateAverage(double[] notes){

		double myTotal = 0.0;
		double myAverage = 0.0;

		for (int i=0; i<notes.length; i++) {
			myTotal += notes[i];
		}

		myAverage = myTotal/notes.length;

		return myAverage;
	}

	public static double calculateMedian(double[] notes){
		return notes[notes.length/2 -1];
	}

	public static int calculateNumberFailed(double[] notes){
		int failCount = 0;

		for (int i=0; i<notes.length; i++) {
			if (notes[i] < 50) {
				failCount++;
			}
		}
		return failCount;
	}

	public static int calculateNumberPassed(double[] notes){
		int passCount = 0;

		for (int i=0; i<notes.length; i++) {
			if (notes[i] >= 50) {
				passCount++;
			}
		}
		return passCount;
	}

}
