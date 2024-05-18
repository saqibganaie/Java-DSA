// Arrays are collection of similar data types.
// Syntax of array in Java : datatype[] varName = new datatype[size]; // 'new' keyword is used to create an object
// datatype[] varName; declaration of an array, varName will be defined in stack
// varName = new datatype[size]; initialization, varName(object) will be created in Heap
// mentioning the size while initializing array is necessary
// the declaration part (datatype[] varName) is done during compile time
// the initialization part (new int[size]) is done durign run time a.k.a dynamic memory allocation (when mem is being allocated during run time)
// arrays in java may or may not be continuous (i.e continuosly stored in mem) because 1. arrays are created in heap 2. heap objects are not necessarily continuous 3. arrays are created using DMA (dynamic mem allocation)
// value of a non initialized object {String - null, int - 0, boolean - false}
public class practice1 {
    public static void main(String[] args) {
        int[] rollNo = new int[5]; // an array of roll numbers having size 10
        String[] name = { "Saqib", "Adnan" }; // array of names with values in it
        // System.out.println(rollNo[1]);

        int temp = 5 + (15 * (3 % 15));
        temp /= 15;
        System.out.println(temp);

    }
}