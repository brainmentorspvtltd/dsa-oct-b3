import java.util.Arrays;

public class FindElements {
    static int[] findOccurrance(int[] arr, int index, int count, int element){
        if(index == arr.length){
            System.out.println("Base case: "+count);
            return new int[count];
        }
        if(arr[index] == element){
            count++;
        }
        int[] res = findOccurrance(arr, index+1, count, element);
        if(element==arr[index]){
            res[count-1]=index;
        }
        System.out.println("Index: "+index+", Count: "+count+", Res: "+Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,20, 20, 30, 20, 30};
        // [1,2,4]
        System.out.println(Arrays.toString(findOccurrance(arr, 0, 0, 20)));
    }
}
