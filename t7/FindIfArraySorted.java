public class FindIfArraySorted {

    static boolean isSorted(int[] arr, int index, String order){
        // base case 
        if(arr.length==index){
            return true;
        }

        // logic to find asc or desc
        if(order==null){
            if(arr[index]>arr[index-1]){
                order = "asc";
            } else if(arr[index]<arr[index-1]){
                order = "des";
            }
        } 

        if(order!=null){
            if(order=="asc"){
                if(arr[index]<arr[index-1]){
                    return false;
                }
            } else {
                if(arr[index]>arr[index-1]){
                    return false;
                }
            }
        }

        return isSorted(arr, index+1, order);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(isSorted(arr, 1, null));
    }
}
