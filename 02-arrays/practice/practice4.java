import java.util.ArrayList;
import java.util.Scanner;

public class practice4 {
    // In java if we want to create variable length arrays then we use ArrayList
    // working of ArrayList (how it takes var size)
    // ArrayList is created and when it is full, it creates a new ArrayList of size
    // more than the prev one, elements of prev ArrayList are copied to the new
    // ArrayList and prev ArrayList is deleted.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<Integer> varArr = new ArrayList<>(5); // In ArrayList elements
        // cannot be primitives(e.g int) they need
        // // to be wrapper calsses ('Integer' here) here 5 is the initial
        // // capacity, it isn't necessary to write
        // // it but meh
        // // functions on ArrayList
        // for (int count = 0; count < 10; count++) {
        // varArr.add(in.nextInt()); // adds given value to ArrayList
        // }
        // System.out.println(varArr);
        // varArr.set(0, 23); // replaces index('0' here) with given value('23' here)
        // varArr.remove(2); // removes value from given index
        // System.out.println(varArr);
        // System.out.println(varArr.get(3)) // // to get the element at given index
        // // ('3' here)

        // there are many more funcitons like these if you want to check them out you
        // can i am not gonna write all of them here

        // 2-D ArrayList
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // Initialisation
        for (int count = 0; count < 3; count++) { // initially ArrayList will be empty so we have to add ArrayLists in
                                                  // it
            list2D.add(new ArrayList<>());
        }
        for (int i = 0; i < list2D.toArray().length; i++) { // print using for loop, we converted the 2D arrayList to
                                                            // array first so that we can apply the .length method on it
            for (int j = 0; j < 4; j++) {
                list2D.get(i).add(j * 4);
            }
        }
        // for (ArrayList<Integer> element : list2D) { // print using for each loop
        // for (int count = 0; count < 5; count++) {
        // element.add(count * 3);
        // }
        // }
        System.out.println(list2D);
    }
}
