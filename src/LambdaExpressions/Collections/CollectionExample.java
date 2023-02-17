package LambdaExpressions.Collections;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CollectionExample {
    public static void main(String[] args) {
    printArrayList();
    Consumer();
    }

    public static void printArrayList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

    }
    public static void Consumer() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

    }
}
