package Map.SortedMap.NavigableMap;


/*

*Java TreeMap is a class that we can use to store our data consisting of key and value pairs that we have in our projects.
*  TreeMaps, which are recommended due to the fast operation of search algorithms on them, store the data in them
* by default by ordering them from smallest to largest.

TreeMap, senkronize bir yapı değildir.
İçerisinde saklamak için boş veri (value) girişine izin verir ancak bu verileri eşlemek için boş anahtar (key) değerlerine izin vermez.
TreeMap içerisinde eklenen öğelerin tekrarlanmasına izin vermez.
Java.util paketinin bir parçasıdır ve Map arayüzünde yer alan işlevleri uygular.


* */


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);

        // Getting values from the tree map
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the tree map
        treeMap.remove("B");

        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
