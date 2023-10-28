package HashMap;
import java.util.*;

public class TypesOfHashMap {
    public static void main(String[] args) {
        
        // NORMAL HashMap
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("C1",426387);
        hmap.put("D1",123);
        hmap.put("A1",92784);
        hmap.put("E1",55);
        hmap.put("B1",3264);

        for(String key : hmap.keySet()){
            System.out.print(key +", ");
        }

        System.out.println();

        // TreeMap EXAMPLE
        TreeMap<String,Integer> tmap = new TreeMap<>();
        tmap.put("C1",426387);
        tmap.put("D1",123);
        tmap.put("A1",92784);
        tmap.put("E1",55);
        tmap.put("B1",3264);

        for(String key : tmap.keySet()){
            System.out.print(key +", ");
        }

        System.out.println();

        // LinkedHashMap EXAMPLE 
        LinkedHashMap<String,Integer> lhmap = new LinkedHashMap<>();
        lhmap.put("C1",426387);
        lhmap.put("D1",123);
        lhmap.put("A1",92784);
        lhmap.put("E1",55);
        lhmap.put("B1",3264);

        for(String key : lhmap.keySet()){
            System.out.print(key +", ");
        }

    }
}
