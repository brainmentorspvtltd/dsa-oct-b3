import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L56 {
    
}
class Solution {
    public int[][] merge(int[][] intervals) {
        // [[1,6],[2, 3], [8, 10], [12, 13], [15, 18]]
        Arrays.sort(intervals, (a1, a2)-> a1[0]-a2[0]);
        List<int[]> result = new ArrayList<>();
        // [[1,3]]
        for(int[] arr: intervals){
            if(result.isEmpty() || result.get(result.size()-1)[1]<arr[0]){
                result.add(arr);
            } else {
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],arr[1]);
            }
        }

        int[][] finalResult = new int[result.size()][2];
        int index = 0;
        for(int[] r: result){
            finalResult[index] = r;
            index++;
        }
        return finalResult;

    }
}