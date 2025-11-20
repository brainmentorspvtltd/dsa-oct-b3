public class MaxOccur {
    static int count = 1;
    static int max = 1;
    static void findOccurance(int[] arr, int index){

        // base case
        if(arr.length == index){
            return;
        }
        if(arr[index] == arr[index-1]){
            count++;
            max = count>max?count:max;
        } else {
            count=1;
        }
        findOccurance(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,3,3,3,4,4,5,5,5,5,6}; // 4
        findOccurance(arr, 1);
        System.out.println(max);
    }
}
