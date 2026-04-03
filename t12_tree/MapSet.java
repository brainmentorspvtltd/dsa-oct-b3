import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapSet {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 10);
        map.put(-1, 20);
        map.put(1, 30);


        System.out.println(map);

        Set<Integer> keys = map.keySet(); 
        System.out.println(keys);
        Set<Integer> sortedKeys = new TreeSet<>(keys);
        System.out.println(sortedKeys);
        
    }
}
