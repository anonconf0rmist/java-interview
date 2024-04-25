import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterfaceExample {
    static void HashMapExample(){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(3,"faiz");
        map.put(1, "tahir");
        map.put(2, "abdul");

        // map.put(1, "isk"); //override
        map.putIfAbsent(1, "isk"); // no override

        System.out.println(map);
        System.out.println(map.get(2)); // abdul
        System.out.println(map.containsKey(4)); // false
        System.out.println(map.containsValue("faiz")); // true

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
    }

    static void LinkedHashMapExample(){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3,"faiz");
        map.put(1, "tahir");
        map.put(2, "abdul");

        // map.put(1, "isk"); //override
        map.putIfAbsent(1, "isk"); // no override

        System.out.println(map); // ordered
        
    }

    static void TreeMap(){
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3,"faiz");
        map.put(1, "tahir");
        map.put(2, "abdul");

        // map.put(1, "isk"); //override
        map.putIfAbsent(1, "isk"); // no override

        System.out.println(map); // sorted
        
    }

    public static void main(String[] args) {
        HashMapExample();
        LinkedHashMapExample();
        TreeMap();
    }
}
