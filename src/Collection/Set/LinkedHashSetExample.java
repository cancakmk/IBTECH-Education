package Collection.Set;

/*
*
*
*
* Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
*  It inherits the HashSet class and implements the Set interface.

The important points about the Java LinkedHashSet class are:

Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operations and permits null elements.
Java LinkedHashSet class is non-synchronized.
Java LinkedHashSet class maintains insertion order.
*
*
* Keeping the insertion order in the LinkedHashset has some additional costs,
*  both in terms of extra memory and extra CPU cycles.
* Therefore, if it is not required to maintain the insertion order,
*  go for the lighter-weight HashMap or the HashSet instead.
*
*
*
* */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
