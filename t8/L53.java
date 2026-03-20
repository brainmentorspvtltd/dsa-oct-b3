public class L53 {
    
}

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int n: nums){
            sum = n + sum;
            sum = Math.max(sum,n);
            max = Math.max(sum,max);
        }
        return max;
    }
}
