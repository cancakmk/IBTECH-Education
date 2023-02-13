package Map.HashMap;






/*
 *
 * Java HashMap class implements the Map interface which allows us to store key and value pair
 * , where keys should be unique. If you try to insert the duplicate key, it will replace the
 * element of the corresponding key.
 * It is easy to perform operations using the key index like updation,
 *  deletion, etc. HashMap class is found in the java.util package.
 *
 *
 * Java HashMap contains values based on the key.
 * Java HashMap contains only unique keys.
 * Java HashMap may have one null key and multiple null values.
 * Java HashMap is non synchronized.
 * Java HashMap maintains no order.
 *
 *
 *
 * */


import java.util.*;

public class HashMapExample {


    public static void main(String args[]){

        CreateHashMapExample();
//        CanNotDuplicateExample();
//        InsertExample();
//        RemoveExample();
//        ReplaceExample();

    }

public static void CreateHashMapExample() {
    //Let's see a simple example of HashMap to store key and value pair.
    HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
    map.put(1,"Mango");  //Put elements in Map
    map.put(2,"Apple");
    map.put(3,"Banana");
    map.put(4,"Grapes");

    System.out.println("Iterating Hashmap...");
    for(Map.Entry m : map.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
    }





}

    public static void CanNotDuplicateExample() {
        //You cannot store duplicate keys in HashMap. However,
        // if you try to store duplicate key with another value, it will replace the value.

        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }





    }

    public static void InsertExample() {
        //Here, we see different ways to insert elements.

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        System.out.println("Initial list of elements: "+hm);
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        System.out.println("After invoking put() method ");
        for(Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(104,"Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }

    public static void RemoveExample() {

        //Here, we see different ways to remove elements.
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103, "Gaurav");
        System.out.println("Initial list of elements: "+map);
        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements: "+map);
        //value-based removal
        map.remove(101);
        System.out.println("Updated list of elements: "+map);
        //key-value pair based removal
        map.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+map);




    }

    public static void ReplaceExample() {
        //Here, we see different ways to replace elements.
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        System.out.println("Initial list of elements:");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Updated list of elements:");
        hm.replace(101, "Vijay", "Ravi");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Updated list of elements:");
        hm.replaceAll((k,v) -> "Ajay");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }




    }



}
