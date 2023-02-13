package Map.IdentityHashMap;


import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/*
*
*
* The IdentityHashMap class is similar to the HashMap class.
* It implements the AbstractMap class. However, it uses reference
* equality rather than object equality while comparing the key (or values).

It is not the general purpose implementation of Map.
* While this class implements the Map interface, it intentionally violates
* Map's general contract that mandates the use of the equals() method when comparing objects.

It is designed especially for the rare cases where the reference-equality semantics are needed.
*  It is used when the user needs the objects to be compared using the reference.
*
*
*
*
* It uses reference equality rather than using the equals() method. It uses the == operator.
It is must to synchronize IdentityHashMap externally as it is not synchronized previously.
The Iterators throw ConcurrentModificationException in while attempting to modify during the iteration.
It provides constant time performance for the basic operations like get and put, assuming that the System.
* identityHashCode(Object) disperse the elements correctly in the bucket. IdentityHashMap doesn't use hashCode() method
*  instead it uses System.identityHashCode() method. This is a significant difference because now you can use mutable
* objects as key in Map whose hash code is likely to change when the mapping is stored inside IdentityHashMap.
*
*
* */
public class IdentityHashMapExample {
    public static void main(String[] args) {
        InsertElement();
        RemoveElement();
        AccessingElement();
        TraversingElements();
        IdentityHashMapVSHashMap();
    }



    public static void InsertElement(){

        // Creating an empty IdentityHashMap
        Map<Integer, String> object_ihm = new IdentityHashMap<Integer, String>();
        // adding key and value pairs
        // mapping String values to integer keys
        object_ihm.put(1, "Hello");
        object_ihm.put(2, "How");
        object_ihm.put(3, "Are");
        object_ihm.put(4, "You");
        object_ihm.put(5, "?");
        // displaying the IdentityHashMap
        System.out.println("The initial mappings are: "
                + object_ihm);
        // inserting existing key along with new value
        // the old value is stored in variable old_value
        String old_value
                = (String)object_ihm.put(1, "Heyyy");
        // verifying the old returned value
        System.out.println("\nReturned value is: "
                + old_value);
        // displaying the new map
        System.out.println("\nIdentityHashMap after changing the value to existing key:\n " + object_ihm);
        // creating a new Identityhash map and copying using putAll()
        Map<Integer, String> new_IdentityhashMap= new IdentityHashMap<Integer, String>();
        new_IdentityhashMap.putAll(object_ihm);
        // Displaying the final IdentityHashMap
        System.out.println("\nThe new IdentityHashMap (copied): "
                + new_IdentityhashMap);




    }
    public static void RemoveElement(){
        // Creating an empty IdentityHashMap
        Map<Integer, String> object_ihm
                = new IdentityHashMap<Integer, String>();
        // adding key and value pairs
        // mapping String values to integer keys
        object_ihm.put(1, "Hello");
        object_ihm.put(2, "How");
        object_ihm.put(3, "Are");
        object_ihm.put(4, "You");
        object_ihm.put(5, "?");
        // displaying the IdentityHashMap
        System.out.println("The initial mappings are: "
                + object_ihm);
        // removing the existing key-value mapping
        String returned_value = (String)object_ihm.remove(3);
        // Displaying the new IdentityHashMap
        System.out.println("\nThe new IdentityHashMap is: "
                + object_ihm);



    }
    public static void AccessingElement(){
        // Creating an empty IdentityHashMap
        Map<Integer, String> object_ihm
                = new IdentityHashMap<Integer, String>();
        // adding key and value pairs
        // mapping String values to integer keys
        object_ihm.put(1, "Hello");
        object_ihm.put(2, "How");
        object_ihm.put(3, "Are");
        object_ihm.put(4, "You");
        object_ihm.put(5, "?");

        // displaying the IdentityHashMap
        System.out.println("The initial mappings are: "
                + object_ihm);
        // accessing the value of 5
        System.out.println("Value of key 5 is:"
                + object_ihm.get(5));
        // accessing the value of 2
        System.out.println("Value of key 2 is:"
                + object_ihm.get(2));
        // getting the set view of keys using keySet()
        System.out.println("Set view of keys: "
                + object_ihm.keySet());
        // getting the set view using entrySet()
        System.out.println("The set is: "
                + object_ihm.entrySet());




    }
    public static void TraversingElements(){
        // Creating an empty IdentityHashMap
        Map<Integer, String> object_ihm
                = new IdentityHashMap<Integer, String>();

        // adding key and value pairs
        // mapping String values to integer keys
        object_ihm.put(1, "Hello");
        object_ihm.put(2, "How");
        object_ihm.put(3, "Are");
        object_ihm.put(4, "You");
        object_ihm.put(5, "?");

        // displaying the IdentityHashMap
        System.out.println("The initial mappings are: "
                + object_ihm);
        // creating an Iterator to traverse over IdentityHashMap
        Iterator<IdentityHashMap.Entry<Integer, String> >
                itr = object_ihm.entrySet().iterator();
        // hasNext() method is used to check if there is a next element
        //The next() method is used to retrieve the next element
        while (itr.hasNext()) {
            IdentityHashMap.Entry<Integer, String> entry
                    = itr.next();
            System.out.println("Key : " + entry.getKey()
                    + ", Value : "
                    + entry.getValue());
        }



    }
    public static void IdentityHashMapVSHashMap(){

        //The IdentityHashMap uses equality operator (==) to compare the key and value while
        // the HashMap uses the equals() method to compare key and value inside the Map.

        //As the IdentityHashMap doesn't use equals() method it is faster than the HashMap.
        //IdentityHashMap doesn't require keys to be immutable as it is not dependant on equals().






        // creating objects of HashMap and IdentityHashMap
        Map<String, String> hm = new HashMap<>();
        Map<String, String> ihm = new IdentityHashMap<>();
        // adding the key value mappings in HashMap object
        hm.put("Hello","505");
        hm.put(new String("Hello"),"101");
        // adding the key value mappings in HashMap object
        ihm.put("Hello","202");
        ihm.put(new String("Hello"),"506");
        // displaying both the maps
        System.out.println("HashMap elements: " + hm);
        System.out.println("HashMap elements: " + ihm);
        // printing the size of HashMap and IdentityHashMap objects
        // hm.size() will print 1 since it compares the objects logically
        // and both the keys are same
        System.out.println("Size of HashMap is : "+hm.size());
        // ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap is : "+ihm.size());




    }
}
