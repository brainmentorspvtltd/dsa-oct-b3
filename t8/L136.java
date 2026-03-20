import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class L136 {
    
}
class Solution {
    public static int singleNumber(int[] nums) {
        System.out.println("doem");
        int r = 0;
        for(int n:nums){
            r = r ^ n;
        }
        return r;
    }
    public static int singleNumber2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int n:nums){
            // if not in map - insert into map
            if(map.get(n)==null){
                map.put(n,n);
            } else {
            // if in map - remove from map
                map.remove(n);
            }
        } 

        Set<Integer> set = map.keySet();
        for(int key:set){
            return map.get(key);
        }
        return 0;
    }
}