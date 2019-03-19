/* Lab1
Exercise 3: ReverseSortDemo
Jennifer Trac
300053014
*/

public class Q3_ReverseSortDemo {

	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.print(unorderedLetters[i]);
	}

	//method that sorts a char array into its reverse alphabetical order
	public static void reverseSort(char[] values){

		int valuesMax;
		char biggestChar;

		for (int i=0; i<values.length-1; i++) {
			//this loop is to move the max to the front of the array
			valuesMax = i;
			for (int j=i+1; j<values.length; j++) {
				// this loop is to find the max of the values
				if (values[j] > values[valuesMax]) {
					valuesMax = j;
				}
			}
			biggestChar = values[valuesMax];
			values[valuesMax] = values[i];
			values[i] = biggestChar;
		}

	}

}
