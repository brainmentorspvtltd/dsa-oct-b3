import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public static int singleNumber(int[] nums) {
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
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        singleNumber(nums);
    }
}