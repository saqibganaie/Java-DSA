// Hashset :-  A HashSet typically refers to a data structure that implements a set using hashing. A hash set is designed to store a collection of unique elements, and it uses a hash function to map each element to a specific location in the underlying data structure.

// In Java, a HashSet is a collection class that implements the Set interface. It is part of the Java Collections Framework and is used to store unique elements. A HashSet does not allow duplicate elements, and it does not guarantee the order of elements.

// Here are some key characteristics and features of a HashSet:

// Uniqueness: A HashSet does not allow duplicate elements. If you attempt to add an element that already exists in the set, the add method will return false, indicating that the element was not added.

//No Order Guarantee: Elements in a HashSet are not stored in any particular order. If you need to maintain the order in which elements are inserted, you should consider using a LinkedHashSet instead.

// Null Values: A HashSet allows null values. You can add a single null value to the set.

// Performance: The performance of basic operations (addition, removal, and lookup) in a HashSet is generally constant time on average.

import java.util.HashSet;
import java.util.Iterator;

public class File1 {
    public static void main(String[] args) {
        // Creating a Hashset
        HashSet<Integer> set = new HashSet<>();

        // Adding element in a hashset
        set.add(200);
        set.add(null);
        set.add(30);
        set.add(10);
        set.add(30);
        set.add(10);

        System.out.println(set);

        // Searching element

        boolean setHasElem = set.contains(10);
        if (setHasElem) {
            System.out.println("Set contains the Element"); 
        }

        // Deleting element
        set.remove(10);
        System.out.println(set);

        // Iterating in Set - we need an iterator for it which we can import
        // The iterator has two functions next() and hasNext();
        // The next() function returns the next() element
        // the hasNext() function checks if there is a next element or not and returns
        // true of false based on that.
        Iterator setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
    }
}