import java.util.ArrayList;
import java.util.List;

public class L46 {
    
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> fl = new ArrayList<>();
        List<Integer> list = new ArrayList();
        helper(fl,list,nums);
        return fl;
    }
    private void helper(List<List<Integer>> fl,List<Integer> list,int[] nums){
        // base case
        if(list.size()==nums.length){
            fl.add(new ArrayList(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                helper(fl,list,nums);
                // backtrack
                list.remove(list.size()-1);
            }
        }

    }
}