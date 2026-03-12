import java.util.Arrays;
import java.util.Comparator;

public class Sorting2 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{8,10},{15,18},{2,6},{12,13}};
        
        Arrays.sort(intervals, (a1, a2)-> a1[0]-a2[0]);

        System.out.println(Arrays.deepToString(intervals));
    }
}
