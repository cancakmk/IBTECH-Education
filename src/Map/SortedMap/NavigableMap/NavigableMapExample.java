package Map.SortedMap.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;



/*
*
*
*
* A NavigableMap can be easily accessed and traversed in either ascending or descending key order.
*  The performance and behavior of ascending operations are likely to be faster and efficient than
* that of the descending order. The descendingMap() method may return a view of the given map.
* The methods like subMap(K, Boolean, K, boolean), headMap(K, boolean) and tailMap(K, boolean) differ from the
* SortedMap method just in accepting the additional arguments which further describes whether the lower and upper
* bounds are either inclusive or exclusive or not.
*
*
* 4*/
public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Integer >   object = new TreeMap<>();
        object.put("Car", 6789);
        object.put("Truck", 2134);
        object.put("Bike", 1234);
        object.put("Scooty", 8765);
        System.out.println("The vehicles along with the allotted numbers are given as : "+object);
        // Returns a key-value mapping which is associated with the least key in the map.
        System.out.println("The first entry is given as : "+object.firstEntry());
        // Returns a key-value mapping which is associated with the greatest key in the map.
        System.out.println("The last entry is given as : "+object.lastEntry());
// Returns a key-value mapping which is associated with the greatest key which is less than or equal to the given key.
        System.out.println("The floor entry is given as : "+object.floorEntry("Car"));
        // Returns the greatest key which is strictly less than the given key.
        System.out.println("The lower key is given as : "+object.lowerKey("Truck"));
    }
}
