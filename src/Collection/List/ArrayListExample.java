package Collection.List;

import java.util.ArrayList;
import java.util.Collections;





/*
    ArrayList sınıfı, birbirini tekrar eden ve boş değerleri içerebilir,
    ArrayList sınıfı, sıralı bir koleksiyondur ekleme sırasını korur,
    ArrayList sınıfı, senkronize bir yapıya sahip değildir. Birden fazla iş bloklarını aynı anda değiştiremez,

*/

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();

        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println();

        cars.get(0); // Access an Item

        cars.set(0, "Opel");// Change an Item

        cars.remove(0);// Remove an Item

        cars.clear(); //Remove all elements

        cars.size(); //ArraylistSize

        Collections.sort(cars);  // Sort cars




    }





}
