package Collection.List.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;



/*
*
*
* The listIterator () method of Java ArrayList returns a list iterator over the
* elements in this list starting at the specified position in this list. The specified index
* indicates the first element that would be returned by an initial call to next.
* An initial call to previous would return the element with the specified index minus one.
*
*
*
* */

public class ListIteratorExample {
    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("d");
        arrlist.add("dd");
        arrlist.add("ddd");
        arrlist.add("dddd");
        arrlist.add("ddddd");
        System.out.println(arrlist);    // [d, dd, ddd, dddd, ddddd]
        ListIterator<String> iterator = arrlist.listIterator(5);
        System.out.println(iterator.hasNext ());    // false
//        iterator =  arrlist.listIterator(6);    // IndexOutOfBoundsException

    }
}
