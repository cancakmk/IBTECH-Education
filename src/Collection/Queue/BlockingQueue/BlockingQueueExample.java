package Collection.Queue.BlockingQueue;



/*
*
* Before directly jumping to the topic 'Blocking Queue' let us first understand Queue in brief.
* Queue is an ordered list of objects where insertions take place at the rear end of the list
* and deletion of elements takes place from the front end. Therefore, it is also said that
* Queue is based on FIFO ( First-In-First-Out ) principle.

BlockingQueue is a queue that additionally supports operations that wait for the queue to become non-empty
* when we are trying to retrieve an element, and wait for the space to be empty when an element
* is to be inserted in the queue. Java 1.5 provides support for BlockingQueue interface along
* with other concurrent utility classes.
*
*
*
*
There is no provision of directly providing an instance of the BlockingQueue since it as an interface,
    so to implement BlockingQueue we need to create classes implementing it.

* ArrayBlockingQueue
DelayQueue
LinkedBlockingDeque
LinkedBlockingQueue
LinkedTransferQueue
PriorityBlockingQueue
SynchronousQueue

*
*
*
*
* add( ): It inserts an element to the BlockingQueue at the end of the queue. It throws an exception when the queue is full.
* element( ): It returns the top or the head of the queue. It throws an exception if the queue is empty.
* remove( ): It removes an element from the BlockingQueue. It throws an exception if the queue is empty.
*
* */


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main( String[ ] args ) {
        // declaring the BlockingQueue of ' bounded ' nature using ArrayBlockingQueue
        BlockingQueue< String > alph = new ArrayBlockingQueue< >( 7 ) ;
        try {
            // Insert element to blocking queue
            alph.put( " A " ) ;
            alph.put( " B " ) ;
            alph.put( " C " ) ;
            alph.put( " D " ) ;
            alph.put( " E " ) ;
            alph.put( " F " ) ;
            alph.put( " G " ) ;
            System.out.println( " Content of BLockingQueue : " + alph ) ;
            // deleting some elements from the queue
            String temp = alph.take( ) ;
            System.out.println( " The number removed is : " + temp ) ;
            // BlockingQueue after deleting one element
            System.out.println( " Content of BLockingQueue after deleting one element : " + alph ) ;
        }
        catch( Exception e ) {
            e.getStackTrace( ) ;
        }
    }
}
