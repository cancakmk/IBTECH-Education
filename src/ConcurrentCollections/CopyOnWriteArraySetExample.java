package ConcurrentCollections;

// Java Program to Illustrate CopyOnWriteArraySet Class

// Importing required classes
import java.util.*;
import java.util.concurrent.*;

// Main class
class CopyOnWriteArraySetExample extends Thread {

    static CopyOnWriteArraySet l
            = new CopyOnWriteArraySet();

    // Method
    public void run()
    {
        // Child thread trying to add
        // new element in the Set object
        l.add("D");
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Adding elements
        // using add() method
        l.add("A");
        l.add("B");
        l.add("C");

        // We create a child thread
        // that is going to modify
        // CopyOnWriteArraySet l.
        CopyOnWriteArraySetExample t = new CopyOnWriteArraySetExample();

        // Running the child thread
        // using start() method
        t.start();

        // Waiting for the thread to
        // add the element

        // Try block to check for exceptions
        try {

            Thread.sleep(2000);
        }

        // Catch block to handle exceptions
        catch (InterruptedException e) {

            // Print statement
            System.out.println(
                    "child going to add element");
        }

        System.out.println(l);

        // Now we iterate through the
        // CopyOnWriteArraySet and we
        // wont get exception.
        Iterator itr = l.iterator();

        while (itr.hasNext()) {

            String s = (String)itr.next();
            System.out.println(s);

            if (s.equals("C")) {

                // Here we will get
                // RuntimeException
                itr.remove();
            }
        }
    }
}
