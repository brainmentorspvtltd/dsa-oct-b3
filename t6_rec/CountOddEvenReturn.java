import java.util.Arrays;

public class CountOddEvenReturn {
    public static int[] countOddEven(int num, int oddCount, int evenCount){
        // base case
        if(num == 0){
            System.out.println("Even: "+evenCount+", Odd: "+oddCount);
            return new int[]{evenCount, oddCount};
        }

        // logic
        int ld = num%10;
        if(ld%2 == 0){
            evenCount++;
        } else {
            oddCount++;
        }
        // small problem - rec call
        int[] result = countOddEven(num/10, oddCount, evenCount);
        System.out.println("Num: "+num+", Result: "+result);
        return result;
    }
    public static void main(String[] args) {
        int[] result = countOddEven(553363, 0, 0);
        
        System.out.println(Arrays.toString(result));
    }
}
