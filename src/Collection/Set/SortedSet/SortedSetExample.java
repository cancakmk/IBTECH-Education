package Collection.Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;


/**
 *
 *
 *
 *A set is used to provide a particular ordering on its element.
 *  The elements are ordered either by using a natural ordering or by using a Comparator.
 *  All the elements which are inserted into a sorted set must implement the Comparable interface.
 *
 * The set's iterator will traverse the set in an ascending order.
 * Several other operations are provided in order to make best use of ordering.
 * All the elements must be mutually comparable.
 *
 *
 *
 * */

public class SortedSetExample
{
    public static void main(String[] args) {
        SortedSet set = new TreeSet<Number>(); ;
        // Add the elements in the given set.
        set.add("Audi");
        set.add("BMW");
        set.add("Mercedes");
        set.add("Baleno");
        System.out.println("The list of elements is given as:");
        for (Object object : set) {
            System.out.println(object);
        }
        //Returns the first element
        System.out.println("The first element is given as: " + set.first());
        //Returns the last element
        System.out.println("The last element is given as: " + set.last());
        //Returns a view of the portion of the given set whose elements are strictly less than the toElement.
        System.out.println("The respective element is given as: " + set.headSet("Baleno"));
        //Returns a view of the map whose keys are strictly less than the toKey.
        System.out.println("The respective element is given as: " + set.tailSet("Audi"));
    }
}
