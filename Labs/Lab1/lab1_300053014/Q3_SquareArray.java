/* Lab1
Exercise 3: method createArray
Jennifer Trac
300053014
*/
public class Q3_SquareArray {

    public static int[] createArray(int size) {
        int[] theArray = new int[size + 1];

        for (int i=0; i<=size; i++) {
            theArray[i] = i*i;
        }
        return theArray;
    }

    public static void main(String[] args) {
        int[] myArray;
        myArray = Q3_SquareArray.createArray(12);

        for (int i = 0; i<myArray.length; i++) {
            System.out.println("The square of " + i + " is: " + myArray[i]);
        }
    }
}
