package ConcurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


/*
*
*
* It is a thread-safe version of ArrayList.
* Insertion is preserved, duplicates, null, and heterogeneous Objects are allowed.
*
*
* */

public class CopyOnWriteArrayListExample extends Thread {
    static CopyOnWriteArrayList<String> l
            = new CopyOnWriteArrayList<String>();

    public void run()
    {
        // Child thread trying to
        // add new element in the
        // Collection object
        l.add("D");
    }

    public static void main(String[] args)
            throws InterruptedException
    {
        l.add("A");
        l.add("B");
        l.add("c");

        // We create a child thread
        // that is going to modify
        // ArrayList l.
        CopyOnWriteArrayListExample t = new CopyOnWriteArrayListExample();
        t.start();

        Thread.sleep(1000);

        // Now we iterate through
        // the ArrayList and get
        // exception.
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(l);
    }
}
