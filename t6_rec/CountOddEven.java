public class CountOddEven {
    public static void countOddEven(int num, int oddCount, int evenCount){
        // base case
        if(num == 0){
            System.out.println("Even: "+evenCount+", Odd: "+oddCount);
            return;
        }

        // logic
        int ld = num%10;
        if(ld%2 == 0){
            evenCount++;
        } else {
            oddCount++;
        }
        // small problem - rec call
        countOddEven(num/10, oddCount, evenCount);

    }
    public static void main(String[] args) {
        countOddEven(553363, 0, 0);
    }
}
