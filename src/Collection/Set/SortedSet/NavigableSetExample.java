package Collection.Set.SortedSet;

import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<String> set =  new TreeSet();
        set.add("Instagram");
        set.add("JavaTpoint");
        set.add("Facebook");
        set.add("Google");
        Set<String> synset = Collections.synchronizedNavigableSet(set);
        System.out.println("Synchronized navigable set is :" + synset);
    }
}
