public class L643 {
    
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        // 1 12 -5 -6
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        int max = sum;
        // 1 12 -5 -6 = 50
        // 0 1   2. 3   4
        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i]; // 6
            sum = sum - nums[i-k]; //  6-4
            max = Math.max(sum, max);
        }
        return (double)max/k;
    }
}