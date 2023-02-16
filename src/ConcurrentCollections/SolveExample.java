package ConcurrentCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SolveExample extends Thread{
    static ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<Integer,String>();
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3,3);

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println("Map Value:" + map.get(key));
            if (key.equals(2)) {
                map.put(1, 4);
            }
        }

    }

}
