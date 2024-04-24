import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceExample {
    static void HashSetExample(){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(48);
        hs.add(10);
        hs.add(15);

        System.out.println(hs); // unordered
        // hs.add(1); // no change
        // hs.remove(2);
        // System.out.println(hs.contains(2));
        // System.out.println(hs.size());
    }

    static void LinkedHashSetExample(){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(48);
        hs.add(10);
        hs.add(15);

        System.out.println(hs); // ordered
    }

    static void TreeSetExample(){
        TreeSet<Integer> hs = new TreeSet<>();

        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(48);
        hs.add(10);
        hs.add(15);

        System.out.println(hs); // sorted
    }
    
    
    public static void main(String[] args) {
        HashSetExample();
        LinkedHashSetExample();
        TreeSetExample();
    }
}
