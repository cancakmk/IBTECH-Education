package Collection.List;

import java.util.EmptyStackException;
import java.util.Stack;


/*
*
* All methods in Vector are Synchronized Thread Safe
* Performance is low
* Legacy Class
*
* The stack is a linear data structure that is used to store the collection of objects.
*  It is based on Last-In-First-Out (LIFO). Java collection framework provides many interfaces
* and classes to store the collection of objects.
*  One of them is the Stack class that provides different operations such as push, pop, search, etc.

* */
public class StackExample {
    public static void main(String args[])
    {
//creating an object of Stack class
        Stack<Integer> stk = new Stack<>();
        System.out.println("stack: " + stk);
//pushing elements into the stack
        pushelmnt(stk, 20);
        pushelmnt(stk, 13);
        pushelmnt(stk, 89);
        pushelmnt(stk, 90);
        pushelmnt(stk, 11);
        pushelmnt(stk, 45);
        pushelmnt(stk, 18);
//popping elements from the stack
        popelmnt(stk);
        popelmnt(stk);
//throws exception if the stack is empty
        try
        {
            popelmnt(stk);
        }
        catch (EmptyStackException e)
        {
            System.out.println("empty stack");
        }
    }
    //performing push operation
    static void pushelmnt(Stack stk, int x)
    {
//invoking push() method
        stk.push(new Integer(x));
        System.out.println("push -> " + x);
//prints modified stack
        System.out.println("stack: " + stk);
    }
    //performing pop operation
    static void popelmnt(Stack stk)
    {
        System.out.print("pop -> ");
//invoking pop() method
        Integer x = (Integer) stk.pop();
        System.out.println(x);
//prints modified stack
        System.out.println("stack: " + stk);
    }
}
