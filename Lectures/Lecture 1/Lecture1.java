public class Lecture1 {
    /*
    Wednesday January 9th, 2019
    How to make a Java program

    1. Variables and data types
    2. Primitive vs. Reference
    3. Comparison operators
    4. Auto-boxing/auto-unboxing
    5. Passing parameters
    6. Scope
    7. Memory management

    Note: The class name matches the file name AND begins with a capital letter.
    */
    public static void main(String[] args) {

        /* 1. Variables and data types

        Assigning a Variable
        - declare the type of object that will be stored in the variable
        so that the compiler will know how much memory is required
        - variables will be begin with a lowercase letter

        */
        int intValue;

        intValue = 33;

        /* 2. Primitive vs. Reference

        Primitive data types: START WITH LOWERCASE
        - byte, short, int, long, float, double, boolean, char

        Reference data types: START WITH UPPERCASE
        - everything else
        - ex. String, Array

        */
        int[] myIntArray;

        String myString;

        String[] myArgs;

        //myString = "Some string data";

        myIntArray = new int[10];
        // Arrays must have a set size in memory
        // now this array can hold up to 10 integers

        myArgs = new String[20];

        int blah = 101;
        System.out.println(blah);

        Constant c = new Constant ("pi", 3.141592653);

        System.out.println(c);

    }

}

class Constant {
    // every java file can only have ONE public class
    // every other class is just "class _____"
    private String name;
    private double value;
    public Constant ( String name, double value ) {
        this.name = name;
        this.value = value;
        // this. is the same as self. in python
    }
}
