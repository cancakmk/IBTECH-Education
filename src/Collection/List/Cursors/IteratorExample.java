package Collection.List.Cursors;


import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

//The iterator() method of Java Collection Interface returns an iterator over the elements in this collection.
public class IteratorExample {

    public static void main(String[] args) {
        Collection<Character> collection = new LinkedBlockingDeque<Character>();
        for (char c = 'a'; c <= 'z'; c++) {
            collection.add(c);
        }
        System.out.print("Characters : ");
        System.out.print("[");
        Iterator<Character> iterator = collection.iterator();
        //will return the iterator for all characters
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ,");
        }
        System.out.println("]");
    }
}
