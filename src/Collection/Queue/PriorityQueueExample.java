package Collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
* The following are some important features of a queue.

As discussed earlier, FIFO concept is used for insertion and deletion of elements from a queue.
The Java Queue provides support for all of the methods of the Collection interface including deletion, insertion, etc.
PriorityQueue, ArrayBlockingQueue and LinkedList are the implementations that are used most frequently.
The NullPointerException is raised, if any null operation is done on the BlockingQueues.
Those Queues that are present in the util package are known as Unbounded Queues.
Those Queues that are present in the util.concurrent package are known as bounded Queues.
All Queues barring the Deques facilitates removal and insertion at the head and tail of the queue; respectively.
* In fact, deques support element insertion and removal at both ends.
* DEFAULT Size 11
* */

public class PriorityQueueExample{
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();

        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("head:"+queue.element());

        System.out.println("head:"+queue.peek());

        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }


}
